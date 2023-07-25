package com.cancodelah.offers.controller;
import com.cancodelah.offers.entitiy.Offers;
import com.cancodelah.offers.service.OffersService;
import com.cancodelah.offers.vo.ResponseTemplateVO;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/offers")
@Table(name="offers")

public class OffersController {
    @Autowired
    private OffersService offersService;
    @PostMapping("/")
    public Offers saveOffers(@RequestBody Offers offers){
        return offersService.saveOffers(offers);
    }
    @GetMapping("/{offersId}")
    public Offers  findByOffersId(@PathVariable("offersId") Long offersId){
        return offersService.findByOffersId(offersId);
    }
    @GetMapping("/offersandmerchant/{offersId}")
    public ResponseTemplateVO findMerchantByOffersId(@PathVariable("offersId") Long offersId){
        return offersService.findMerchantByOffersId(offersId);
    }

}
