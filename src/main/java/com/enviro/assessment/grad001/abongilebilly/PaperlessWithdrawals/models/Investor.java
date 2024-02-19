package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Investor {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

    private String address;

    @OneToMany(mappedBy = "investor")
    private List<Product> product;
}
