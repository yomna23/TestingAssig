package model;

public class country {
String name ;
String population ;
String capital ;

public country()
{}

public country(String name, String population, String capital) {
	super();
	this.name = name;
	this.population = population;
	this.capital = capital;
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
