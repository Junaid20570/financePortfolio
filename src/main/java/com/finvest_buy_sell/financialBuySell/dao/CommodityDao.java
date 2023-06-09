package com.finvest_buy_sell.financialBuySell.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.finvest_buy_sell.financialBuySell.model.Commodity;

@Repository
public interface CommodityDao extends CrudRepository<Commodity, Integer> {
	
	public List<Commodity> findByEmail(String email);

}
