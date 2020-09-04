package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.st.service.StockPriceService;

@RestController
public class StockPriceController {

	@Autowired
	private StockPriceService service;
	
	@GetMapping(value="/stockPrice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("companyName")String companyName){
		
		Double stockPrice=service.getStockPrice(companyName);
		return new ResponseEntity<>(stockPrice,HttpStatus.OK);
	}
}
