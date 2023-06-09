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

import com.finvest_buy_sell.financialBuySell.model.Commodity;
import com.finvest_buy_sell.financialBuySell.services.CommodityService;

@CrossOrigin
@RestController
@RequestMapping("finport/commodity")
public class CommodityController {
	@Autowired
	CommodityService commodityService;
	@GetMapping("/getCommodity/{email}")
	   public ResponseEntity<List<Commodity>> getAllCommodity(@PathVariable String email){
		   List<Commodity> finalCommodity=commodityService.getAllComodities(email);
		   return new ResponseEntity<List<Commodity>>(finalCommodity,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveCommodity/{email}")
	   public ResponseEntity<Commodity> saveStock(@RequestBody Commodity commodity, @PathVariable String email){
		   commodity.setEmail(email);
		   Commodity finalCommodity=commodityService.saveCommodity(commodity);
		   return new ResponseEntity<Commodity>(finalCommodity,HttpStatus.OK);
		   
	   }
	   
	   @DeleteMapping("/sellCommodity")
	   public ResponseEntity<Commodity> sellCommodity(@RequestBody Commodity bond){
		   Commodity finalBond=commodityService.delCommodity(bond);
		   return new ResponseEntity<Commodity>(finalBond,HttpStatus.OK);
		   
	   }

}
