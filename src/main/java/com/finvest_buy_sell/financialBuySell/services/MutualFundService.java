package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.model.MutualFund;


@Service
public interface MutualFundService {
      public MutualFund saveMutualFund(MutualFund mutualFund);
      public List<MutualFund> getAllMutualFund(String email);
      
      public MutualFund delFund(MutualFund bond);

}
