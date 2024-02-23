package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.InvestorDto;

public class InvestorMapper {
    public Investor mapToInvestor(InvestorDto investorDto)
    {
        Investor investor = new Investor();
        investor.setFirstName(investorDto.getFirstName());
        investor.setLastName(investorDto.getLastName());
        investor.setEmail(investorDto.getEmail());
        investor.setAddress(investorDto.getAddress());
        investor.setAge(investorDto.getAge());

        return investor;

    }

    public InvestorDto mapToInvestorDto(Investor investor)
    {
        InvestorDto investorDto = new InvestorDto();
        investorDto.setFirstName(investor.getFirstName());
        investorDto.setLastName(investor.getLastName());
        investorDto.setAge(investor.getAge());
        investorDto.setAddress(investor.getAddress());
        investorDto.setEmail(investor.getEmail());
        investorDto.setId(investor.getId());

        return  investorDto;
    }
}
