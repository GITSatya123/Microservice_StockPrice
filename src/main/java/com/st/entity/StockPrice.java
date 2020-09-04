package com.st.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stock_price")
public class StockPrice {

	@Column(name="stock_Id")
	@Id
	private Integer stockId;
	
	@Column(name="company_Name")
	private String companyName;
	
	@Column(name="company_Price")
	private Double companyPrice;
}
