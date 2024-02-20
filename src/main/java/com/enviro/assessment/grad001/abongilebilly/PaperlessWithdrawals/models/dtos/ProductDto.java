package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String investmentType;
    private String investmentName;
}
