package com.st.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.entity.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Serializable>{

	public StockPrice findByCompanyName(String companyName);
}
