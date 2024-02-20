package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Investor,Integer> {
}
