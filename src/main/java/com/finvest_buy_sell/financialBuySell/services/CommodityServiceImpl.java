package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.dao.CommodityDao;
import com.finvest_buy_sell.financialBuySell.model.Commodity;


@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    CommodityDao commodityDao;
	@Override
	public Commodity saveCommodity(Commodity commodity) {
		return commodityDao.save(commodity);
	}

	@Override
	public List<Commodity> getAllComodities(String email) {
		
		return (List<Commodity>) commodityDao.findByEmail(email);
	}

	@Override
	public Commodity delCommodity(Commodity bond) {
		// TODO Auto-generated method stub
		commodityDao.deleteById(bond.getCommodityId());
		return bond;
	}

}
