package com.capitol.springboot.app.prices.models.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capitol.springboot.app.prices.models.entity.Brand;
import com.capitol.springboot.app.prices.models.entity.Price;

public interface PriceDao extends CrudRepository<Price, Long>{
	
	//@Query("select product_id, brand_id, price, start_date, end_date from prices where start_date >= ?1 and end_date <= ?1 and productId = ?2 and brand_id = ?3")
	public List<Price> findByStartDateGreaterThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrand(Date startDate, Date endDate, long productId, Brand brand);

}
