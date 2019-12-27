package com.bridgeLabz.dataStructure;


  //This class has a integer data type variable and a reference type variable

public class Node {
	protected int data;
	protected Node next;

	/*
	  constructor to initialize the class variables during object creation.
	  
	 */
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}