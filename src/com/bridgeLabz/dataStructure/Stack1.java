package com.bridgeLabz.dataStructure;

import java.util.EmptyStackException;

/*
   It is a linear data structure which is used to store data on the basis of
   LIFO => Last In First Out THis class has certain functions like length =>
   length of the list isEmpty => which checks whether the list is empty or not.
   push => insert a data to the list. pop => used to remove the last entered
   data from the list. peek => check the data entered at last. print => to get
   the list of all the data present in the list.

 */
public class Stack1<G> {
	private Node1<G> top;
	private int size;

	
	public Stack1() {
		this.top = null;
		this.size = 0;
	}

	
	 // checks whether the list is empty.

	 
	public boolean isEmpty() {
		return size == 0;
	}

	
	public int size() {
		return size;
	}

	
	public void push(G data) {
		Node1<G> newNode = new Node1<G>(data);
		newNode.next = top;
		top = newNode;
		size++;
	}

	
	 
	public G pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			G removed = top.data;
			top = top.next;
			size--;
			return removed;
		}
	}

	
	public G peak(G data) {
		if (!isEmpty()) {
			return top.data;
		} else {
			throw new EmptyStackException();
		}
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Empty Stack!");
		} else {
			Node1<G> current = top;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println("null");
		}
	}

}