package com.finvest_buy_sell.financialBuySell.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finvest_buy_sell.financialBuySell.model.RealEstate;

@Repository
public interface RealEstateDao extends CrudRepository<RealEstate, Integer> {

	public List<RealEstate> findByEmail(String email);
	
}
