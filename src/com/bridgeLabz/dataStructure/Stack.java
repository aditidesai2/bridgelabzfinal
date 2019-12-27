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
public class Stack extends CommonElements implements ICommon {
	private Node top;

	
	public Stack() {
		this.length = 0;
		this.top = null;
	}

	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		length++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int removed = top.data;
		top = top.next;
		length--;
		return removed;
	}

	/*
	 * if the list is not empty it will return the value which is pointed by top.

	 */
	public int peak() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}

	
	@Override
	public void print() {
		if (top == null) {
			System.out.println("Stack is Empty!");
		} else {
			Node current = top;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println("null");
		}

	}

}