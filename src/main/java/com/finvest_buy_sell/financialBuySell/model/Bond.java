package com.finvest_buy_sell.financialBuySell.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bond {
     @Id
     private int bondId;
     private String email;
     private String bondName;
     private String tenure;
     private double price;
     private String YTM;//(Yield To Maturity)
     private String frequency;
     private String taxable;
     private int volume;
}
