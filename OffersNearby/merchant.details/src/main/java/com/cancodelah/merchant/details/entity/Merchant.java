package com.cancodelah.merchant.details.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Type;

import java.util.HashMap;
import java.util.Map;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name="merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long merchantId;
    private String merchantCategory;
    private String merchantName;
//    @Convert(converter = HashMapConverter.class)
    private String locationJSON;

}

