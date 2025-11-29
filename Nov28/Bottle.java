package com.demo.IoStream.Nov28;

import java.io.Serializable;

public class Bottle implements Serializable {

	
	private int bottle;
	private String brand;
	private double cost;
	private String colour;
	public int getBottle() {
		return bottle;
	}
	public void setBottle(int bottle) {
		this.bottle = bottle;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Bottle(int bottle, String brand, double cost, String colour) {
		super();
		this.bottle = bottle;
		this.brand = brand;
		this.cost = cost;
		this.colour = colour;
	}
	public Bottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bottle [bottle=" + bottle + ", brand=" + brand + ", cost=" + cost + ", colour=" + colour + "]";
	}
	
	
}
