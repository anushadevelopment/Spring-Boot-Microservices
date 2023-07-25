package com.cancodelah.merchant.details.repository;

import com.cancodelah.merchant.details.entity.Merchant;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MerchantRepository extends JpaRepository <Merchant, Long>{

    Merchant findByMerchantId(Long merchantId);
}
