package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services.WithdrawalNoticeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@NoArgsConstructor
@Controller
public class WithdrawalNoticeController {
    private WithdrawalNoticeService withdrawalNoticeService;
}
