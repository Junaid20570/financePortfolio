package com.finvest_buy_sell.financialBuySell.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finvest_buy_sell.financialBuySell.model.MutualFund;

@Repository
public interface MutualFundDao extends CrudRepository<MutualFund, Integer> {
	public List<MutualFund> findByEmail(String email);
}
