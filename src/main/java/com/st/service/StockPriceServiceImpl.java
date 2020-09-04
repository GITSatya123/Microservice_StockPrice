package com.st.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.entity.StockPrice;
import com.st.exception.CompanyNotFoundException;
import com.st.repo.StockPriceRepo;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	@Autowired
	private StockPriceRepo repo;
	
	@Override
	public double getStockPrice(String companyName) {
			StockPrice stockprice=repo.findByCompanyName(companyName);
			
			if(stockprice==null) {
				throw new CompanyNotFoundException("Company not available");
			}
		return stockprice.getCompanyPrice();
	}

}
