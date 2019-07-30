package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country")

public class Country {
	@Id
	@Column(name = "Country_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Country_Name")
	private String name;
	@Column(name = "Country_Capital")
	private String capital;
	@Column(name = "Country_Population")
	private double population;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	

}
