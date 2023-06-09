package com.finvest_buy_sell.financialBuySell.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finvest_buy_sell.financialBuySell.model.MutualFund;
import com.finvest_buy_sell.financialBuySell.services.MutualFundService;

@CrossOrigin
@RestController
@RequestMapping("finport/mutualfund")
public class MutualFundController {
    @Autowired
    MutualFundService mutualFundService;
    @GetMapping("/getmutualfunds/{email}")
    public ResponseEntity<List<MutualFund>> getAllMutualFund(@PathVariable String email){
 	   List<MutualFund> finalMutualFund=mutualFundService.getAllMutualFund(email);
 	   return new ResponseEntity<List<MutualFund>>(finalMutualFund,HttpStatus.OK);
 	   
    }
    @PostMapping("/saveFund/{email}")
    public ResponseEntity<MutualFund> saveStock(@RequestBody MutualFund mutualFund,@PathVariable String email){
 	   mutualFund.setEmail(email);
    	MutualFund createdMutualFund=mutualFundService.saveMutualFund(mutualFund);
 	   return new ResponseEntity<MutualFund>(createdMutualFund,HttpStatus.OK);
 	   
    }
    
	   @DeleteMapping("/sellFund")
	   public ResponseEntity<MutualFund> sellBond(@RequestBody MutualFund bond){
		   MutualFund finalBond=mutualFundService.delFund(bond);
		   return new ResponseEntity<MutualFund>(finalBond,HttpStatus.OK);
		   
	   }
}
