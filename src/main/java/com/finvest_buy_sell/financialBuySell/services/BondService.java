package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.model.Bond;


@Service
public interface BondService {
	  public Bond saveBond(Bond bond);
      public List<Bond> getAllBonds(String email);
      
      public Bond delBond(Bond bond);

}
