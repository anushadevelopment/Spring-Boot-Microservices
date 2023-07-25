package com.cancodelah.offers.repository;

import com.cancodelah.offers.entitiy.Offers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersRepository extends JpaRepository<Offers, Long> {
    Offers findByOffersId(Long offersId);


}
