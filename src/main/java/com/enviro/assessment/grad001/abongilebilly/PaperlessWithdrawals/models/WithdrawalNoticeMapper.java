package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.WithdrawalNoticeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Configuration
public class WithdrawalNoticeMapper {

    // Mapping WithdrawalNotice to  WithdrawalNoticeDto
    public WithdrawalNoticeDto noticeToNoticeDto(WithdrawalNotice withdrawalNotice)
    {
        WithdrawalNoticeDto noticeDto = new WithdrawalNoticeDto();
        noticeDto.setAmountWithdrawn(withdrawalNotice.getWithdrawalAmount());
        Product product = new Product();
        withdrawalNotice.setProduct(product);
        product.setId(withdrawalNotice.getProduct().getId());
        noticeDto.setCurrentBalance(withdrawalNotice.getProduct().getCurrentBalance());
        noticeDto.setTransactionStatus("Transaction was Successful !! ");

        return noticeDto;
    }
}
