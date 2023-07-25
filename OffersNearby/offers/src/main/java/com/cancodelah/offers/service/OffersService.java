package com.cancodelah.offers.service;

import com.cancodelah.offers.entitiy.Offers;
import com.cancodelah.offers.repository.OffersRepository;
import com.cancodelah.offers.vo.Merchant;
import com.cancodelah.offers.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OffersService {
    @Autowired
    private OffersRepository offersRepository;

    @Autowired
    private RestTemplate restTemplate;
    public Offers saveOffers(Offers offers) {
        return offersRepository.save(offers);
    }

    public ResponseTemplateVO findMerchantByOffersId(Long offersId) {
        Offers offers = offersRepository.findByOffersId(offersId);
        ResponseTemplateVO vo = new ResponseTemplateVO();

        Merchant merchantResponse =
                restTemplate.getForObject("http://localhost:9006/merchant/" + offers.getMerchantId(), Merchant.class);
        vo.setMerchant(merchantResponse);
        vo.setOffers(offers);
        return vo;
    }

    public Offers findByOffersId(Long offersId) {
        return offersRepository.findByOffersId(offersId);
    }
}
