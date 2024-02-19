package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    private String investmentType;

    private String name;

    private Long currentBalance;

    @ManyToOne
    @JoinColumn(
            name = "investorID"
    )
    private Investor investor;

    @OneToMany(mappedBy = "product")
    private List<WithdrawalNotice> withdrawalNotice;
}

