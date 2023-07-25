package com.cancodelah.merchant.details.controller;
import com.cancodelah.merchant.details.entity.Merchant;
import com.cancodelah.merchant.details.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;
    @PostMapping("/")
    public Merchant SaveMerchant (@RequestBody Merchant merchant){
        return merchantService.saveMerchant(merchant);
    }

    @GetMapping("/{merchantId}")
    public Merchant findMerchantById(@PathVariable("merchantId") Long merchantId){
        return merchantService.findByMerchantId(merchantId);
    }

}


