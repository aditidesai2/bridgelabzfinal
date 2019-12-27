package com.bridgeLabz.objectOriented.inventoryManagement.model;

/*
  Basic functionality of name weight and price along with
  getter and setter methods and to string method to print the data.

 */
public class Inventory {

	private String name;
	private int weight;
	private double price;

	/*
	  This constructor assign the values during object creation.
	
	 */
	public Inventory(String name, int weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	/*
	  Getter method which returns String data.
	
	 */
	public String getName() {
		return name;
	}

	/*
	  Setter method which sets the name by taking name as input parameter.

	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	/*
	  Setter method which sets the weight by taking weight as input parameter.

	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	/*
	  Setter method which sets the price by taking price as input parameter.

	 */
	public void setPrice(double price) {
		this.price = price;
	}

	
	//  Override method of toString which prints all the data of the class.
	 
	@Override
	public String toString() {
		return "name=" + this.name + "\nweight=" + this.weight + "\nprice=" + this.price;
	}

	/*
	  Takes the input parameter given in the method and returns new Object whenever
	  we need to create a object.

	 */
	public static Inventory createInventory(String name, int weight, double price) {
		return new Inventory(name, weight, price);
	}

}