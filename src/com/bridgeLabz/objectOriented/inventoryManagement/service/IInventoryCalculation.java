package com.bridgeLabz.objectOriented.inventoryManagement.service;

import java.util.ArrayList;

import com.bridgeLabz.objectOriented.inventoryManagement.model.Inventory;

/*
  Interface which has the implementation of methods like calculateTotalWeight()
  , calculateTotalPrice() , displayInventory().

 */
public interface IInventoryCalculation {

	public int calculateTotalWeight(ArrayList<Inventory> inventory);

	public double calculateTotalPrice(ArrayList<Inventory> inventory);

	public void displayInventory(ArrayList<Inventory> inventory);

}