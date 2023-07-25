package com.cancodelah.merchant.details.service;

import com.cancodelah.merchant.details.entity.Merchant;
import com.cancodelah.merchant.details.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;
    public Merchant saveMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }
    public Merchant findByMerchantId(Long merchantId) {
        return merchantRepository.findByMerchantId(merchantId);
    }
}
