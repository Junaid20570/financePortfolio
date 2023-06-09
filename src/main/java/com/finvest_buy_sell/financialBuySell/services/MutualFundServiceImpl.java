package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.dao.MutualFundDao;
import com.finvest_buy_sell.financialBuySell.model.MutualFund;


@Service
public class MutualFundServiceImpl implements MutualFundService {
    @Autowired
    MutualFundDao mutualFundDao;
	@Override
	public MutualFund saveMutualFund(MutualFund mutualFund) {
		// TODO Auto-generated method stub
		return  mutualFundDao.save(mutualFund);
	}

	@Override
	public List<MutualFund> getAllMutualFund(String email) {
		// TODO Auto-generated method stub
		return (List<MutualFund>) mutualFundDao.findByEmail(email);
	}

	@Override
	public MutualFund delFund(MutualFund bond) {
		// TODO Auto-generated method stub
		mutualFundDao.deleteById(bond.getMutualFundId());
		return bond;
	}

}
