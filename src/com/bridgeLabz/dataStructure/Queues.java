package com.bridgeLabz.dataStructure;

import java.util.NoSuchElementException;

/*
   It is a linear data structure which is used to store data on the basis of
   FIFO => First In First Out THis class has certain functions like length =>
   length of the list isEmpty => which checks whether the list is empty or not.
   enQueue => insert a data to the list. deQueue => used to remove the last
   entered data from the list print => to get the list of data present. first =>
   value of first element. last => value of last element present in the list.

 */

public class Queues extends CommonElements implements ICommon {

	private Node front;
	private Node end;

	
	public Queues() {
		this.length = 0;
		this.front = null;
		this.end = null;
	}

	public void enQueue(int data) {
		Node newNode = new Node(data);
		if (front == null) {
			front = newNode;
		} else {
			end.next = newNode;
		}
		end = newNode;
		length++;
	}

	
	public int deQueue() {
		int result;
		if (isEmpty()) {
			throw new NoSuchElementException("List is Empty");
		} else {
			result = front.data;
			front = front.next;
			if (front == null) {
				end = null;
			}
		}
		length--;
		return result;
	}

	
	public int first() {
		if (isEmpty()) {
			throw new NoSuchElementException("List is Empty");
		}
		return front.data;
	}

	
	public int last() {
		if (isEmpty()) {
			throw new NoSuchElementException("List is Empty");
		}
		return end.data;
	}


	@Override
	public void print() {
		if (front == null) {
			System.out.println("Stack is Empty!");
		} else {
			Node current = front;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println();
		}
	}

}