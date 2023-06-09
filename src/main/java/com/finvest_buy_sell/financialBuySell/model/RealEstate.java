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
public class RealEstate {
   
	@Id
	private int realEstateId;
	private String email;
	private String propertyType;
	private String name;
	private String Location;
	private Double currentPrice;
	private Double previousPrice;
	private int volume;
	
}
