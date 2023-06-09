package com.finvest_buy_sell.financialBuySell.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finvest_buy_sell.financialBuySell.model.Commodity;


@Service
public interface CommodityService {
    public Commodity saveCommodity(Commodity commodity);
    public List<Commodity> getAllComodities(String email);
    
    public Commodity delCommodity(Commodity bond);

}
