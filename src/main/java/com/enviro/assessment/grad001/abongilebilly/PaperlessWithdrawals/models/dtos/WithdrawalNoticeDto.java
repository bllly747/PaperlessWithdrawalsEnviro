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

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Integer age;
    private String investmentType;
    private String investmentName;
    private Integer currentBalance;
    private Integer withdrawalAmount;
    private String bankDetails;

    
}
