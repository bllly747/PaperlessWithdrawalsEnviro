package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawalNoticeDto{



    private Integer withdrawalAmount;

    private LocalDateTime dateTime;

    private String transactionStatus;

    private String BankDetails;

    private Integer productId;

    
}
