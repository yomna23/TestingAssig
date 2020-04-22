package model;

import java.io.Serializable;

public class country implements Serializable  {

private static final long serialVersionUID = 5517244812959569947L;

String name ;
String population ;
String capital ;


public country()
{}

public country(String name ,String population, String capital) {
	super();
	this.population = population;
	this.capital = capital;
	this.name = name ;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPopulation() {
	return population;
}
public void setPopulation(String population) {
	this.population = population;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}


}