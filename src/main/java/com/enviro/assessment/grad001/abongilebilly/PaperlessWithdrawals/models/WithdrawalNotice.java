
package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WithdrawalNotice {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer withdrawalAmount;

    private LocalDateTime dateTime;

    private String transactionStatus;

    private String BankDetails;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

}
