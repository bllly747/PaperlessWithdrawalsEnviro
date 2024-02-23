package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    private String investmentName;

    private Integer currentBalance;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(
            name = "investorID"
    )
    private Investor investor;

    @JsonManagedReference
    @OneToMany(mappedBy = "product")
    private List<WithdrawalNotice> withdrawalNotice;
}

