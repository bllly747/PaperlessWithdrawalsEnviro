package com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.services;

import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Investor;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.Product;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.WithdrawalNotice;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.dtos.WithdrawalNoticeDto;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.models.mappers.WithdrawalNoticeMapper;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.InvestorRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.ProductRepository;
import com.enviro.assessment.grad001.abongilebilly.PaperlessWithdrawals.repositories.WithdrawalNoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WithdrawalNoticeService {

    @Autowired
    private WithdrawalNoticeRepository withdrawalNoticeRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private InvestorRepository investorRepository;
    WithdrawalNoticeMapper mapper = new WithdrawalNoticeMapper();
    //Getting List of Dtos by Mappeing First notice->noticedto
    public List<WithdrawalNoticeDto> getNotice()
    {
        List<WithdrawalNotice> notices = withdrawalNoticeRepository.findAll();
        return notices.stream()
                .map((notice)->mapper.mapToNoticeDto(notice))
                .collect(Collectors.toList());
    }

    //Adding List of Dtos by Mappeing First notice->noticedto
    public WithdrawalNoticeDto addNotice(WithdrawalNoticeDto withdrawalNoticeDto)
    {
        WithdrawalNotice withdrawalNotice =  new WithdrawalNotice();
        withdrawalNotice = mapper.mapToNotice(withdrawalNoticeDto);
        Optional<Product> product = productRepository.findById(withdrawalNoticeDto.getProductId());
        Optional<Investor> investor = investorRepository.findById(product.get().getInvestor().getId());
        if(investor.get().getAge() > 65)
        {
            withdrawalNotice.setTransactionStatus("Success");
        }
        withdrawalNoticeRepository.save(withdrawalNotice);

        return withdrawalNoticeDto;
    }

}
