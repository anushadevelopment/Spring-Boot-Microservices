package com.cancodelah.offers.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long offersId;
    private long merchantId;
    private Date startDate;
    private Date endDate;
    private String OfferDescription;
    private float percentage;
    private float hardMoney;
}


