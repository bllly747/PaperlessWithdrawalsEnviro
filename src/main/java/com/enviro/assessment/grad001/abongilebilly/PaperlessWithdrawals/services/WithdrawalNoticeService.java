package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.InformationMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.WithdrawalNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class WithdrawalNoticeService {

    @Autowired
    private WithdrawalNoticeRepository withdrawalNoticeRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private InvestorRepository investorRepository;




    public List<WithdrawalNotice> getNotice()
    {
        return withdrawalNoticeRepository.findAll();
    }

    public WithdrawalNotice addNotice(WithdrawalNotice withdrawalNotice)
    {
        Optional<Product> product = productRepository.findById(withdrawalNotice.getProduct().getId());
        Optional<Investor> investor = investorRepository.findById(product.get().getInvestor().getId());

        return withdrawalNoticeRepository.save(withdrawalNotice);
    }

}
