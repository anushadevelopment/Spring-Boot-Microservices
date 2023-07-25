package com.cancodelah.offers.vo;


import com.cancodelah.offers.entitiy.Offers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Offers offers;
    private Merchant merchant;
}
