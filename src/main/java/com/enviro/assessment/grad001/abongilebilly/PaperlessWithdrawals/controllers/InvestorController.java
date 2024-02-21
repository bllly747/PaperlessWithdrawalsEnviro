package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services.InvestorService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class InvestorController {

    @Autowired
    private InvestorService investorService;


    @GetMapping("/investors")
    public List<Investor> getInvestors()
    {

        return investorService.getInvestors();
    }

    @PostMapping("/investors")
    public Investor addInvestor(
            @RequestBody Investor investor
    )
    {
        return investorService.addInvestor(investor);
    }


}
