package com.bridgeLabz.dataStructure;

import java.util.NoSuchElementException;

/*
   It is a linear data structure of generic Type which is used to store data on
   the basis of FIFO => First In First Out THis class has certain functions like
   size => length of the list isEmpty => which checks whether the list is empty
   or not. enQueue => insert a data to the list. deQueue => used to remove the
   last entered data from the list print => to get the list of data present.
   first => value of first element. last => value of last element present in the
   list.

 */
public class Queue1<G> {
	private Node1<G> front;
	private Node1<G> end;
	private int size;

	
	// constructor for the Queue class which initialize front, end and size.

	
	public Queue1() {
		this.front = null;
		this.end = null;
		this.size = 0;
	}

	
	//  when size of list is 0 it returns boolean value.

	 
	public boolean isEmpty() {
		return size == 0;
	}

	
	public int size() {
		return size;
	}

	
	public void enQueue(G data) {
		Node1<G> newNode = new Node1<G>(data);
		if (front == null) {
			front = newNode;
		} else {
			end.next = newNode;
		}
		end = newNode;
		size++;
	}

	
	public G deQueue() {
		G deQueueData;
		if (isEmpty()) {
			throw new NoSuchElementException("\nQueue is empty...");
		} else {
			deQueueData = front.data;
			front = front.next;
			if (front == null) {
				end = null;
			}
			size--;
			return deQueueData;
		}
	}

	
	public G first() {
		if (isEmpty()) {
			throw new NoSuchElementException("\nQueue is empty...");
		}
		return front.data;
	}

	
	public G last() {
		if (isEmpty()) {
			throw new NoSuchElementException("\nQueue is empty...");
		}
		return end.data;
	}

	
	public void print() {
		if (isEmpty()) {
			System.out.println("Empty List...");
		} else {
			Node1<G> current = front;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println();
		}
	}

	
	public G peak() {
		if (!isEmpty()) {
			return front.data;
		} else {
			throw new NoSuchElementException();
		}
	}

}