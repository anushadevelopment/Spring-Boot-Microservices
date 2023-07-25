package com.cancodelah.offers.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Merchant {
    private String merchantName;
    private String merchantCategory;
    private String locationJSON;
}
