package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNoticeMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.WithdrawalNoticeDto;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.WithdrawalNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WithdrawalNoticeService {

    @Autowired
    private WithdrawalNoticeRepository withdrawalNoticeRepository;

    @Autowired
    private WithdrawalNoticeMapper withdrawalNoticeMapper;

    public List<WithdrawalNotice> getNotice()
    {
        return withdrawalNoticeRepository.findAll();
    }

    public WithdrawalNoticeDto addNotice(WithdrawalNotice withdrawalNotice)
    {
        withdrawalNoticeRepository.save(withdrawalNotice);

        return withdrawalNoticeMapper.noticeToNoticeDto(withdrawalNotice);
    }


}
