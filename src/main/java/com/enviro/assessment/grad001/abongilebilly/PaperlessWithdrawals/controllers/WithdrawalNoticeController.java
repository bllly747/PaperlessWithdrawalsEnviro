package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers;


import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.WithdrawalNoticeDto;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers.WithdrawalNoticeMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services.WithdrawalNoticeService;
import lombok.Data;
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
    private WithdrawalNoticeService withdrawalNoticeService;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/notices")
    public List<WithdrawalNoticeDto> getNotice()
    {


        return withdrawalNoticeService.getNotice();
    }

    @PostMapping("/notices")
    public WithdrawalNoticeDto addNotice(
            @RequestBody WithdrawalNoticeDto withdrawalNoticeDto
    )
    {

        return withdrawalNoticeService.addNotice(withdrawalNoticeDto);
    }
}
