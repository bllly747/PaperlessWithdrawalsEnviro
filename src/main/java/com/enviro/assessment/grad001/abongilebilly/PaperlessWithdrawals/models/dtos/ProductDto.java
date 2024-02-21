package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto{

    private String investmentType;
    private String investmentName;
    private Integer currentBalance;

}
