package service;

import java.util.Hashtable;


import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
		countries.put("colombia", count);
		
	}
	
    
	@Cacheable(value="countryService",key="#name")
	public country getcountry(String name) 
	{ 
		
		try
        {   
             System.out.println("Going to sleep for 3 Secs.. to simulate backend call.");
            Thread.sleep(1000*3) ;   	
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
		
		if(countries.containsKey(name))
			 return countries.get(name);
		 else
		     return null ;
			
	}
		
  public Hashtable<String,country> getAll()
  {
	  return countries ;
  }

	@Override
	public void run(String... args) throws Exception {
		returnService();
		
	}	
}
