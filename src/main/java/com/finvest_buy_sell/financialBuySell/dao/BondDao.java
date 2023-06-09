package com.finvest_buy_sell.financialBuySell.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finvest_buy_sell.financialBuySell.model.Bond;

@Repository
public interface BondDao extends CrudRepository<Bond, Integer> {
	
	public List<Bond> findByEmail(String email);
	

}
