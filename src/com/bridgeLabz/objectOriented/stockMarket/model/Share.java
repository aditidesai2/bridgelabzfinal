package com.bridgeLabz.objectOriented.stockMarket.model;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * This class has the all functionality of a stock Share like name, symbol,
 * price, quantity, Time, Date.
 */
public class Share {
	private String name;
	private String symbol;
	private double price;
	private int quantity;

	
	//  Constructor to initialize the following parameter.

	
	public Share(String name, String symbol, double price, int quantity, LocalDate date, LocalTime time) {
		this.name = name;
		this.symbol = symbol;
		this.price = price;
		this.quantity = quantity;
		getCurrentDate();
		getCurrentTime();
	}

	
	//  getter method to getName of the Share.

	 
	public String getName() {
		return name;
	}

	
	//  Setter method to set the name of the Stock

	 
	public void setName(String name) {
		this.name = name;
	}

	
	//  getter method to getSymbol of the Share.

	 
	public String getSymbol() {
		return symbol;
	}

	
	 // Setter method to set Symbol of the Stock

	 
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	
	//  getter method to getPrice of the Share.

	 
	public double getPrice() {
		return price;
	}

	
	// Setter method to set Price of the Stock
	 
	public void setPrice(double price) {
		this.price = price;
	}

	
	//  getter method to getCurrentDate of the Share.
	 
	 
	public LocalDate getCurrentDate() {
		return java.time.LocalDate.now();
	}

	
	//  getter method to getCurrentTime of the Share.
	 
	public LocalTime getCurrentTime() {
		return java.time.LocalTime.now();
	}

	
	//  getter method to getQuantity of the Share.

	 
	public int getQuantity() {
		return quantity;
	}

	
	//  Setter method to set the quantity of the Stock.

	 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	//  This function takes name, symbol, price, quantity, date, time as input
	  //parameter and returns new Class type new Object.

	 
	public static Share createShare(String name, String symbol, double price, int quantity, LocalDate date,
			LocalTime time) {
		return new Share(name, symbol, price, quantity, date, time);
	}

}