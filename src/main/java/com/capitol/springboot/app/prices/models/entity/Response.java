package com.capitol.springboot.app.prices.models.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Response {

	private long productId;
	private Brand brand;
	private BigDecimal price;
	private Date startDate;
	private Date endDate;
	
	
	
	public Response() {
		super();
	}

	public Response(long productId, Brand brand, BigDecimal price, Date startDate, Date endDate) {
		super();
		this.productId = productId;
		this.brand = brand;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
