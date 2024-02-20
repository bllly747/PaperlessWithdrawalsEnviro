package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WithdrawalNoticeDto {

    private Long withdrawalAmount;

    private LocalDateTime dateTime;
}
