package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.dao.BondDao;
import com.finvest_buy_sell.financialBuySell.model.Bond;


@Service
public class BondServiceImpl implements BondService {
	@Autowired
	BondDao bondDao;

	@Override
	public Bond saveBond(Bond bond) {
		// TODO Auto-generated method stub
		return bondDao.save(bond);
	}

	@Override
	public List<Bond> getAllBonds(String email) {
		// TODO Auto-generated method stub
		return (List<Bond>) bondDao.findByEmail(email);
	}

	@Override
	public Bond delBond(Bond bond) {
		// TODO Auto-generated method stub
		bondDao.deleteById(bond.getBondId());
		return bond;
	}

	

}
