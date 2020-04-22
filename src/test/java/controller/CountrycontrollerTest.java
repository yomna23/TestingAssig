package controller;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Hashtable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.anyString;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import model.country;
import service.countryService;

class CountrycontrollerTest {
    @InjectMocks
	Countrycontroller co;
	@Mock
	countryService serv ;
	country c ;
	Hashtable<String,country> Hc;
	
	final String country_Name="colombia" ;
	@BeforeEach
	void SetUp()
	{
		MockitoAnnotations.initMocks(this);
	    c = new country();
		c.setName(country_Name);
		c.setCapital("Bogotá");
		c.setPopulation("48759958");
		Hc = new Hashtable<String,country>();
		Hc.put("country", c);
	}
	@Test
	void testCountryinfo() {
		when(serv.getcountry(anyString())).thenReturn(c);
	    country countryTest=co.getCountry(country_Name);
	    String TN = countryTest.getName();
	    String TC = countryTest.getCapital();
	    String TP= countryTest.getPopulation();
	    assertNotNull(countryTest);
	    assertEquals(country_Name,TN);
	    assertEquals(c.getCapital(),TC);
	    assertEquals(c.getPopulation(),TP);
	  
	}
	
	@Test
	void testgetAll() {
		when(serv.getAll()).thenReturn(Hc);
		Hashtable<String,country> testResult = co.getAll();
		    assertNotNull(testResult);
		  	
	}
	 
}


