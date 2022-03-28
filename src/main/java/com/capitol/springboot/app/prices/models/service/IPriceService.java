package com.capitol.springboot.app.prices.models.service;

import java.text.ParseException;
import java.util.List;

import com.capitol.springboot.app.prices.models.entity.Brand;
import com.capitol.springboot.app.prices.models.entity.Price;
import com.capitol.springboot.app.prices.models.entity.Response;

public interface IPriceService {

	public List<Response> findPrice(String date, long productId, Brand brand) throws ParseException;
	
}
