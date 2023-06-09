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

import com.finvest_buy_sell.financialBuySell.model.RealEstate;
import com.finvest_buy_sell.financialBuySell.services.RealEstateService;


@CrossOrigin
@RequestMapping("finport/realestate")
@RestController
public class RealEstateController {
	
	
	@Autowired
	RealEstateService realEstateService;
	@GetMapping("/getAllRealEstate/{email}")
	   public ResponseEntity<List<RealEstate>> getAllRealEstate(@PathVariable String email){
		   List<RealEstate> finalRealEstates=realEstateService.getAllRealEstates(email);
		   return new ResponseEntity<List<RealEstate>>(finalRealEstates,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveRealEstate/{email}")
	   public ResponseEntity<RealEstate> saveStock(@RequestBody RealEstate realEstate, @PathVariable String email){
		   realEstate.setEmail(email);
		   RealEstate createdRealEstate=realEstateService.saveRealEstate(realEstate);
		   return new ResponseEntity<RealEstate>(createdRealEstate,HttpStatus.OK);
	   }
	   
	   @DeleteMapping("/sellRE")
	   public ResponseEntity<RealEstate> sellRE(@RequestBody RealEstate bond){
		   RealEstate finalBond=realEstateService.delBond(bond);
		   return new ResponseEntity<RealEstate>(finalBond,HttpStatus.OK);
		   
	   }
}

