package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;


class ncountryServiceTest2 {

	
	@Test
	void PopulationtestTrue() {
		countryService ser = new countryService();
		String output = ser.returnName();
		Assert.assertEquals("colombia", output);
	}
	
	
	@Test
	void PopulationtestFalse() {
		countryService ser = new countryService();
		String output = ser.returnName();
		Assert.assertEquals("colombia", output);
	}
	}


