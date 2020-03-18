package service;

import java.util.Hashtable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.country;



@Service
public class countryService implements CommandLineRunner{

	RestTemplate restTemplate = new RestTemplate();
	country count = restTemplate.getForObject("https://restcountries.eu/rest/v2/alpha/co", country.class);
	
	Hashtable<String,country> countries = new Hashtable<String,country>();
	
	private void returnService()
	{  
		
		String cap = count.getCapital();
		String pop =count.getPopulation();
		String nm = count.getName();
		country c = new country();
		c.setCapital(cap);
		c.setPopulation(pop);
		c.setName(nm);
		countries.put("1", c);
		
	}
	
	public country getcountry (String id)
	{
		if(countries.containsKey(id))
			return countries.get(id);
		else
			return null ;
	}
	
	public Hashtable <String, country> getAll()
	{
		return countries;
	}

	@Override
	public void run(String... args) throws Exception {
		returnService();
		
	}	
}