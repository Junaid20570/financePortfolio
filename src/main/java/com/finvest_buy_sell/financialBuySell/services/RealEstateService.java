package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.model.RealEstate;



@Service
public interface RealEstateService {
	  public RealEstate saveRealEstate(RealEstate realEstate);
	    public List<RealEstate> getAllRealEstates(String email);
	    
	      public RealEstate delBond(RealEstate bond);


}
