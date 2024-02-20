package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.controllers.InvestorController;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaperlessWithdrawalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(PaperlessWithdrawalsApplication.class, args);
	}

}
