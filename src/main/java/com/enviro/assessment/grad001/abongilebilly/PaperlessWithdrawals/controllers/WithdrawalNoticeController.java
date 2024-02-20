package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers;


import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.WithdrawalNoticeRepository;
import lombok.Data;
import lombok.With;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class WithdrawalNoticeController {
    @Autowired

    private WithdrawalNoticeRepository withdrawalNoticeRepository;

    @GetMapping("/notices")
    public List<WithdrawalNotice> getNotice()
    {
        return withdrawalNoticeRepository.findAll();
    }

    @PostMapping("/notices")
    public WithdrawalNotice addNotice(
            @RequestBody WithdrawalNotice withdrawalNotice
    )
    {
        return withdrawalNoticeRepository.save(withdrawalNotice);
    }
}
