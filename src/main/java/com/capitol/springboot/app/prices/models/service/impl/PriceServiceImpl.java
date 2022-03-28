package com.capitol.springboot.app.prices.models.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitol.springboot.app.prices.models.dao.PriceDao;
import com.capitol.springboot.app.prices.models.entity.Brand;
import com.capitol.springboot.app.prices.models.entity.Price;
import com.capitol.springboot.app.prices.models.entity.Response;
import com.capitol.springboot.app.prices.models.service.IPriceService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PriceServiceImpl implements IPriceService{

	@Autowired
	private PriceDao priceDao;
	
	
	@Transactional(readOnly = true)
	public List<Response> findPrice(String date, long productId, Brand brand) throws ParseException {
		List<Response> response = new ArrayList<Response>();
		Date convertedDate = StringToDate(date);
		List<Price> result = (List<Price>) priceDao.findByStartDateGreaterThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrand(convertedDate, convertedDate, productId, brand);
		result.stream().forEach(price -> {
			response.add((Response) objectMapper(price));
		});
		return response;
	}
	
	private Date StringToDate(String stringDate) throws ParseException {
		Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(stringDate);
		return date;
	}
	
	private Object objectMapper(Object object){
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    	Response response = mapper.convertValue(object, Response.class);
        return response;
    }

}
