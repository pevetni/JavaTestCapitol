package com.capitol.springboot.app.prices.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capitol.springboot.app.prices.models.entity.Brand;
import com.capitol.springboot.app.prices.models.entity.Response;
import com.capitol.springboot.app.prices.models.service.IPriceService;

@RestController
public class PriceController {
	
	@Autowired
	private IPriceService priceService;
	
	@GetMapping("/list/{dateApp}/{productId}/{brand}")
	public List<Response> list(@PathVariable("dateApp") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") String dateApp, @PathVariable("productId") long productId, @PathVariable("brand") long brand) throws ParseException{
		return priceService.findPrice(dateApp, productId, Brand.valueOf(brand));
	}
	

}
