package com.capitol.springboot.app.prices.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application.properties")
class PriceControllerTest {
	
	@Autowired
    private MockMvc mvc;

	/***
	 * Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception 
	 */
	@Test
	void testOne() throws Exception {
		mvc.perform(get("/list/2020-06-14 10:00:00.000000/35455/1")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content()
			      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			      .andExpect(jsonPath("$[0].productId", is(35455)))
			      .andExpect(jsonPath("$[0].brand", is("ZARA")))
			      .andExpect(jsonPath("$[0].price", is(25.45)))
			      .andExpect(jsonPath("$[0].startDate", is("2020-06-14T18:00:00.000+00:00")))
			      .andExpect(jsonPath("$[0].endDate", is("2020-06-14T21:30:00.000+00:00")))
			      .andExpect(jsonPath("$[1].productId", is(35455)))
			      .andExpect(jsonPath("$[1].brand", is("ZARA")))
			      .andExpect(jsonPath("$[1].price", is(30.50)))
			      .andExpect(jsonPath("$[1].startDate", is("2020-06-15T03:00:00.000+00:00")))
			      .andExpect(jsonPath("$[1].endDate", is("2020-06-15T14:00:00.000+00:00")))
			      .andExpect(jsonPath("$[2].productId", is(35455)))
			      .andExpect(jsonPath("$[2].brand", is("ZARA")))
			      .andExpect(jsonPath("$[2].price", is(38.95)))
			      .andExpect(jsonPath("$[2].startDate", is("2020-06-15T19:00:00.000+00:00")))
			      .andExpect(jsonPath("$[2].endDate", is("2021-01-01T02:59:59.000+00:00")));
			      
	}
	
	/***
	 * Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception 
	 */
	@Test
	void testTwo() throws Exception {
		mvc.perform(get("/list/2020-06-14 16:00:00.000000/35455/1")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content()
			      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			      .andExpect(jsonPath("$[0].productId", is(35455)))
			      .andExpect(jsonPath("$[0].brand", is("ZARA")))
			      .andExpect(jsonPath("$[0].price", is(30.50)))
			      .andExpect(jsonPath("$[0].startDate", is("2020-06-15T03:00:00.000+00:00")))
			      .andExpect(jsonPath("$[0].endDate", is("2020-06-15T14:00:00.000+00:00")))
			      .andExpect(jsonPath("$[1].productId", is(35455)))
			      .andExpect(jsonPath("$[1].brand", is("ZARA")))
			      .andExpect(jsonPath("$[1].price", is(38.95)))
			      .andExpect(jsonPath("$[1].startDate", is("2020-06-15T19:00:00.000+00:00")))
			      .andExpect(jsonPath("$[1].endDate", is("2021-01-01T02:59:59.000+00:00")));
			      
	}
	
	/***
	 * Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception 
	 */
	@Test
	void testThree() throws Exception {
		mvc.perform(get("/list/2020-06-14 21:00:00.000000/35455/1")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content()
			      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			      .andExpect(jsonPath("$[0].productId", is(35455)))
			      .andExpect(jsonPath("$[0].brand", is("ZARA")))
			      .andExpect(jsonPath("$[0].price", is(30.50)))
			      .andExpect(jsonPath("$[0].startDate", is("2020-06-15T03:00:00.000+00:00")))
			      .andExpect(jsonPath("$[0].endDate", is("2020-06-15T14:00:00.000+00:00")))
			      .andExpect(jsonPath("$[1].productId", is(35455)))
			      .andExpect(jsonPath("$[1].brand", is("ZARA")))
			      .andExpect(jsonPath("$[1].price", is(38.95)))
			      .andExpect(jsonPath("$[1].startDate", is("2020-06-15T19:00:00.000+00:00")))
			      .andExpect(jsonPath("$[1].endDate", is("2021-01-01T02:59:59.000+00:00")));
			      
	}
	
	/***
	 * Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception 
	 */
	@Test
	void testFour() throws Exception {
		mvc.perform(get("/list/2020-06-15 10:00:00.000000/35455/1")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content()
			      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			      .andExpect(jsonPath("$[0].productId", is(35455)))
			      .andExpect(jsonPath("$[0].brand", is("ZARA")))
			      .andExpect(jsonPath("$[0].price", is(38.95)))
			      .andExpect(jsonPath("$[0].startDate", is("2020-06-15T19:00:00.000+00:00")))
			      .andExpect(jsonPath("$[0].endDate", is("2021-01-01T02:59:59.000+00:00")));
			      
	}
	
	/***
	 * Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
	 * @throws Exception 
	 */
	@Test
	void testFive() throws Exception {
		mvc.perform(get("/list/2020-06-16 21:00:00.000000/35455/1")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content()
			      .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			      .andExpect(content().string("[]"));
			      
	}

}
