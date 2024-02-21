package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.WithdrawalNoticeDto;

public class WithdrawalNoticeMapper {

    public WithdrawalNoticeDto mapToNoticeDto(WithdrawalNotice withdrawalNotice)
    {
        WithdrawalNoticeDto withdrawalNoticeDto = new WithdrawalNoticeDto();
        withdrawalNoticeDto.setWithdrawalAmount(withdrawalNotice.getWithdrawalAmount());
        withdrawalNoticeDto.setTransactionStatus(withdrawalNotice.getTransactionStatus());
        withdrawalNoticeDto.setDateTime(withdrawalNotice.getDateTime());
        withdrawalNoticeDto.setProductId(withdrawalNotice.getProduct().getId());

        return withdrawalNoticeDto;
    }

    public WithdrawalNotice mapToNotice(WithdrawalNoticeDto withdrawalNoticeDto)
    {
        WithdrawalNotice withdrawalNotice = new WithdrawalNotice();
        withdrawalNotice.setWithdrawalAmount(withdrawalNoticeDto.getWithdrawalAmount());
        var product = new Product();
        product.setId(withdrawalNoticeDto.getProductId());
        withdrawalNotice.setProduct(product);
        withdrawalNotice.setTransactionStatus(withdrawalNoticeDto.getTransactionStatus());
        withdrawalNotice.setDateTime(withdrawalNoticeDto.getDateTime());

        return withdrawalNotice;
    }
}
