package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.InvestorDto;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers.InvestorMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepository investorRepository;
    InvestorMapper mapper = new InvestorMapper();


    public List<InvestorDto> getInvestors()
    {
        List<Investor> investors = investorRepository.findAll();


        return investors.stream()
            .map((investor)->mapper.mapToInvestorDto(investor))
            .collect(Collectors.toList());
    }

    public InvestorDto addInvestor(InvestorDto investorDto)
    {
        Investor investor = mapper.mapToInvestor(investorDto);
        investorRepository.save(investor);

        return investorDto;
    }

}
