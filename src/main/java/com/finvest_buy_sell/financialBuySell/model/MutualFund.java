package com.finvest_buy_sell.financialBuySell.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MutualFund {
	@Id
	private int mutualFundId;
	private String email;
	private String schemeName;
	private String type;
	private String intrestRepayment;
	private String principleRepayment;
	private double amount;
	private String category;
	private int volume;
	

}
