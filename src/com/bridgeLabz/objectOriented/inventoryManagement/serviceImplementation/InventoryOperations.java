package com.bridgeLabz.objectOriented.inventoryManagement.serviceImplementation;

import java.util.ArrayList;

import com.bridgeLabz.objectOriented.inventoryManagement.model.Inventory;
import com.bridgeLabz.objectOriented.inventoryManagement.service.IInventoryCalculation;

/*
 * This class implements InventoryCalculation Interface and performs basic
 * operation like adding to the inventory updating the inventory , removing from
 * inventory , searching data from inventory. Implemented methods like
 * calculating total price , total weight in the inventory and also prints all
 * the data present in the inventory.
 */
public class InventoryOperations implements IInventoryCalculation {
	private String inventoryName;
	public ArrayList<Inventory> inventoryList;

	/*
	 * Constructor to initialize ArrayList and sets the inventory name which is
	 * passed through this.

	 */
	public InventoryOperations(String name) {
		this.inventoryName = name;
		this.inventoryList = new ArrayList<Inventory>();
	}

	/*
	 * Getter method to get inventory name.

	 */
	public String getInventoryName() {
		return inventoryName;
	}

	/*
	 * Setter method to set inventory name.

	 */
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	/*
	 * Override method of IInventoryClaculation interface which display the total
	 * weight of the object present in Inventory.

	 */
	@Override
	public int calculateTotalWeight(ArrayList<Inventory> inventory) {
		int totalWeight = 0;
		for (int i = 0; i < inventory.size(); i++) {
			int individualWeight = inventory.get(i).getWeight();
			totalWeight += individualWeight;
		}
		return totalWeight;
	}

	/*
	 * Override method of InventoryCalculation interface which displays the total
	 * price of the object present in Inventory.

	 */
	@Override
	public double calculateTotalPrice(ArrayList<Inventory> inventory) {
		double totalPrice = 0.0;
		for (int i = 0; i < inventory.size(); i++) {
			double individualPrice = inventory.get(i).getPrice();
			totalPrice += individualPrice;
		}
		return totalPrice;
	}

	/*
	 * Override method of InventoryCalculation interface which displays all the data
	 * present in Inventory in string format.

	 */
	@Override
	public void displayInventory(ArrayList<Inventory> inventory) {
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i).toString());
			System.out.println("------------------");
		}
	}

	/*
	 * Takes newItem of class type as input parameter and checks whether it is
	 * present or not in the inventory ArrayList. if not present then add it in the
	 * inventory else displays with the proper message and finally returns boolean
	 * value.

	 */
	public boolean addNewItem(Inventory newItem) {
		if (findInInventory(newItem.getName()) >= 0) {
			System.out.println("Item already exist in the list.");
			return false;
		}
		inventoryList.add(newItem);
		return true;
	}

	/*
	 * Takes inventory whole class type item as input parameter and returns index
	 * position of inventory.

	 */
	private int findInInventory(Inventory inventoryItem) {
		return this.inventoryList.indexOf(inventoryItem);
	}

	/*
	 * if name matches with the Inventory object's name then returns index position
	 * of the object

	 */
	private int findInInventory(String name) {
		for (int i = 0; i < inventoryList.size(); i++) {
			Inventory fetchedItem = this.inventoryList.get(i);
			if (fetchedItem.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Takes product name as input parameter and from there it search for the index
	 * position by calling FinInInventory(), if index position is positive number it
	 * returns complete class from that position. else return null.

	 */
	public Inventory searchInInventory(String productName) {
		int position = findInInventory(productName);
		if (position >= 0) {
			return this.inventoryList.get(position);
		}
		return null;
	}

	/*
	 * Takes newItem of class type as input parameter and checks whether it is
	 * present or not in the inventory ArrayList. if present then remove from the
	 * inventory else display with the proper message and finally returns boolean
	 * value.

	 */
	public boolean removeItem(Inventory itemName) {
		int foundPosition = findInInventory(itemName);
		if (foundPosition < 0) {
			System.out.println(itemName.getName() + " was not found.");
			return false;
		}
		this.inventoryList.remove(foundPosition);
		return true;
	}

	/*
	 * Takes newItem of class type as input parameter and checks whether it is
	 * present or not in the inventory ArrayList. If found then it set the newItem
	 * at that position else display with the proper error message and finally
	 * returns boolean value.

	 */
	public boolean updateInventory(Inventory oldItem, Inventory newItem) {
		int foundPosition = findInInventory(oldItem);
		if (foundPosition < 0) {
			System.out.println(oldItem.getName() + " was not found.");
			return false;
		}
		this.inventoryList.set(foundPosition, newItem);
		return true;
	}

	/*
	 * If the list is not empty then it iterate through complete list of items and
	 * finally display all elements present in the list in the form of toString
	 * method defined in Inventory class.
	 */
	public void printInventory() {
		if (inventoryList.isEmpty()) {
			System.out.println("Inventory is empty");
		}
		for (int i = 0; i < inventoryList.size(); i++) {
			System.out.println((i + 1) + inventoryList.get(i).toString());
		}
	}

}