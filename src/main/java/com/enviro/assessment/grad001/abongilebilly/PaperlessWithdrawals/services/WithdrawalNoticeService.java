package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.WithdrawalNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WithdrawalNoticeService {

    @Autowired
    private WithdrawalNoticeRepository withdrawalNoticeRepository;

    public List<WithdrawalNotice> getNotice()
    {
        return withdrawalNoticeRepository.findAll();
    }

    public WithdrawalNotice addNotice(WithdrawalNotice withdrawalNotice)
    {
        return withdrawalNoticeRepository.save(withdrawalNotice);
    }

}
