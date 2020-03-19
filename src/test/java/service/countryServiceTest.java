package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class countryServiceTest {

	@Test
	void capitaltestTrue() {
		countryService ser = new countryService();
		String output = ser.returnCapital();
		Assert.assertEquals("Bogotá", output);
	}
	@Test
	void capitaltestFalse() {
		countryService ser = new countryService();
		String output = ser.returnCapital();
		Assert.assertEquals("Cairo", output);
	}

	
}
