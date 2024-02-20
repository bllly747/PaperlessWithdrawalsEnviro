package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithdrawalNoticeRepository extends JpaRepository<WithdrawalNotice,Integer> {
}
