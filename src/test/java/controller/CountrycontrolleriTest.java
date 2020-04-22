package controller;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;

class CountrycontrolleriTest {
    
	
	
	TestRestTemplate restTemplate =new TestRestTemplate();
    
	HttpHeaders header = new HttpHeaders();
	
	@Test
	public void testRetriveCountryTrue() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/guide?name=colombia", String.class);
		String expected = "{\"name\":\"Colombia\",\"population\":\"48759958\",\"capital\":\"Bogotá\"}";
		assertEquals(expected,response);
	
	}
	
	@Test
	public void testRetriveCountryFalse() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/guide?name=egypt", String.class);
		String expected = "{\"name\":\"colombia\",\"population\":\"48759958\",\"capital\":\"Bogotá\"}";
		assertEquals(expected,response);
		
	}
	
	@Test
	public void testAPInull() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/country/all", String.class);
	    assertNull(response);
	
	}
	
	@Test
	public void testAPINotnull() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/all", String.class);
	    assertNotNull(response);
	
	}
	

	
	/*@Test
	public void testRetriveCountrypopulationTrue() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/colombia/guide?info=population", String.class);
		String expected = "48759958" ;
		assertEquals(expected,response);
	
	}
	
	@Test
	public void testRetriveCountrypopulationFalse() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/colombia/guide?info=population", String.class);
		String expected = "4859958" ;
		assertEquals(expected,response);
	
	}
	
	@Test
	public void testRetriveCountrypopulationNull() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/colombia/guide?info=population", String.class);
		assertNull(response);
	
	}
	
	@Test
	public void testRetriveCountrypopulationNotNull() 
	{
		String response = restTemplate.getForObject("http://localhost:8080/countries/colombia/guide?info=population", String.class);
		assertNotNull(response);
	}*/
	
	
	
}
