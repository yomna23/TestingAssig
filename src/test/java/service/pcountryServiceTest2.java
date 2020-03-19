package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class pcountryServiceTest2 {

	@Test
	void PopulationtestTrue() {
		countryService ser = new countryService();
		String output = ser.returnPopulation();
		Assert.assertEquals("48759958", output);
	}
	
	@Test
	void PopulationtestFalse() {
		countryService ser = new countryService();
		String output = ser.returnPopulation();
		Assert.assertEquals("48795", output);
	}
}
