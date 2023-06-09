package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.dao.RealEstateDao;
import com.finvest_buy_sell.financialBuySell.model.RealEstate;


@Service
public class RealEstateServiceImpl implements RealEstateService {
	
	@Autowired
	RealEstateDao realEstateDao;

	@Override
	public RealEstate saveRealEstate(RealEstate realEstate) {
		
		return realEstateDao.save(realEstate);
	}

	@Override
	public List<RealEstate> getAllRealEstates(String email) {
		
		return (List<RealEstate>) realEstateDao.findByEmail(email);
	}

	@Override
	public RealEstate delBond(RealEstate bond) {
		// TODO Auto-generated method stub
		realEstateDao.deleteById(bond.getRealEstateId());
		return bond;
	}
	
	

}
