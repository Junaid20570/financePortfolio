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

import com.finvest_buy_sell.financialBuySell.model.Bond;
import com.finvest_buy_sell.financialBuySell.services.BondService;

@CrossOrigin
@RestController
@RequestMapping("finport/bond")
public class BondController {
	@Autowired
	BondService bondService;
	
	@GetMapping("/getBond/{email}")
	   public ResponseEntity<List<Bond>> getAllBonds(@PathVariable String email){
		   List<Bond> finalBonds=bondService.getAllBonds(email);
		   return new ResponseEntity<List<Bond>>(finalBonds,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveBond/{email}")
	   public ResponseEntity<Bond> saveStock(@RequestBody Bond bond, @PathVariable String email){
		   bond.setEmail(email);
		   Bond finalBond=bondService.saveBond(bond);
		   return new ResponseEntity<Bond>(finalBond,HttpStatus.OK);
		   
	   }
	   
	   @DeleteMapping("/sellBond")
	   public ResponseEntity<Bond> sellBond(@RequestBody Bond bond){
		   Bond finalBond=bondService.delBond(bond);
		   return new ResponseEntity<Bond>(finalBond,HttpStatus.OK);
		   
	   }
	  
}
