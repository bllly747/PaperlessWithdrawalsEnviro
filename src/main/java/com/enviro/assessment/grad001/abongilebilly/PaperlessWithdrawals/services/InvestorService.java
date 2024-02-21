package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepository investorRepository;


    public List<Investor> getInvestors()
    {

        return investorRepository.findAll();
    }

    public Investor addInvestor(Investor investor)
    {

        return investorRepository.save(investor);
    }

}
