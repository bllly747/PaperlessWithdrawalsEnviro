package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InvestorDto {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String address;
    private Integer productId;
}
