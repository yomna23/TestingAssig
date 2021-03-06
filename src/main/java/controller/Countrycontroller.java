package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.country;
import service.countryService;

@RestController
@RequestMapping("/countries")
public class Countrycontroller {

	@Autowired
	countryService cs ;
	
	@RequestMapping("/all")
	public Hashtable<String, country> getAll()
	{
		return cs.getAll();
	}
	
	
	 
    @RequestMapping(value="/guide")
    @ResponseBody
	public country getCountry(@RequestParam("name")String name) 
	{   
		
		return cs.getcountry(name);
	}  
	
	
	
	
	}

