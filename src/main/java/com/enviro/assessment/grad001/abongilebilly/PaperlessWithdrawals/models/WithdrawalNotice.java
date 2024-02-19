
package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

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

    private Long withdrawalAmount;

    private LocalDateTime dateTime;

    private String BankDetails;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

}
