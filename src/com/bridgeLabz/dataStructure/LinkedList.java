package com.bridgeLabz.dataStructure;

import java.util.NoSuchElementException;

/*
   This class has some methods like print => to print the data. insertAtStart =>
   to insert element at start. insert => to insert the element at last.
   overloaded method insert => to insert the element at particular position.
   deleteAtStart => to delete element at start. delete => to delete the element
   at last. overloaded method delete => to delete the element at particular
   position. search => to find whether the searching data is present or not in
   the list getData => to get the data of the list printString => print the data
   in string format. getIndex => to get the index of the searching data.
 */
public class LinkedList<G> {
	private Node1<G> head;
	private int length;

	public LinkedList() {
		this.length = 0;
		this.head = null;
	}

	
	 // it checks the length of the List.
	 
	 
	public int length() {
		return length;
	}

	
	 
	 // it checks whether the List is empty or not .
	 
	
	public boolean isEmpty() {
		return length == 0;
	}

	
	 
	 // Fetch the data of the node.
	 
	public G getData() {
		Node1<G> current = head;
		return current.getData();
	}

	
	 // keeps on concatenating String value and at the end of the loop it returns the
	 // value in String format.
	 
	public String printString() {
		Node1<G> current = head;
		String data = "";
		while (current != null) {
			data = data + current.data + ",";
			current = current.next;
		}
		return data;
	}

	/*
	 * if list is not empty then a temporary reference variable points to top of
	 * list. while loop iterate till temporary variable points to null. while
	 * iterating it prints the data which is pointed by its reference variable and
	 * pointer is shifted to next node.
	 */
	public void print() {
		Node1<G> current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	
	 // This method will print the data in particular file location .
	 
	 
	public void print(String storingLocation) {
		Node1<G> current = head;
		while (current != null) {
			Util.writeToFile((String) current.data, storingLocation);
			current = current.next;
		}
		System.out.println("File updated successfully...");
	}

	
	 // It takes the generic data as   input and creates a new Node and checks if list
	 // is empty or not, if not empty then newNode's reference is pointed by head and
	 // head points to newNode. After Successfully insertion length is incremented.
	
	 
	public boolean insertAtStart(G data) {
		Node1<G> newNode = new Node1<G>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
		return true;
	}

	
	 // It takes the generic data inputed by user and creates a new Node and checks
	 // if list is empty or not, if not empty then newNode's reference is pointed by
	 // lastNode and after Successfully insertion length is incremented.
	
	 
	public boolean insert(G data) {
		Node1<G> newNode = new Node1<G>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node1<G> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		length++;
		return true;
	}

	
	 // Accepts generic data type. NewNode object is created and traversed to get
	 // insertion position's next node address.
	
	public boolean insert(G data, int position) {
		Node1<G> newNode = new Node1<G>(data);
		// as this condition satisfies the insertion at beginning and zero position
		if (isEmpty() || position == 0) {
			insertAtStart(data);
			return true;
			// inserting at the position greater than length of the list and negative index
		} else if (position > length || position < 0) {
			System.out.println(
					"Insertion at position " + position + " is not possible..." + "\nlist length : " + length());
			return false;
			// inserting at the index position.
		} else {
			Node1<G> current = head;
			
			  //This loop iterate till the position given by user and it follows zero index.
			 // it fetch the address of next position's next node.
			 
			for (int i = 0; i < position - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			length++;
			return true;
		}
	}

	
	//  simply the head's next pointer is pointed to its next element and first node
	 // is garbage collected. After successfully deletion length is decremented.
	 
	public G deleteFirst() {
		Node1<G> current = head;
		if (isEmpty()) {
			throw new NoSuchElementException("\nEmpty List! Deletion not possible...");
		} else {
			head = head.next;
			length--;
			return current.data;
		}

	}

	
	 // second last node is pointed to null by detaching from list and marked as last
	 // node. Last node is garbage collected. After successfully deletion length is
	 // decremented
	  
	 
	 
	public G delete() {
		Node1<G> current = head;
		if (isEmpty()) {
			throw new NoSuchElementException("\nEmpty List! Deletion not possible...");
		} else if (length == 1) {
			head = null;
			length--;
			return current.data;
		} else {

			while (current.next.next != null) {
				current = current.next;
			}
			G removedData = current.next.data;
			current.next = null;
			length--;
			return removedData;
		}

	}

	
	 // Traversed to get deletion position's next node address and previous node
	 // address. Previous node's address is pointed to next node address and current
	 // node is garbage collected. After successfully deletion length is decremented.
	 
	 
	public G delete(int position) {
		Node1<G> current = head;
		// if deletion position is negative number and greater than list length.
		if (position < 0 || position >= length()) {
			throw new NoSuchElementException(
					"Insertion at position " + position + " is not possible..." + "\nlist length : " + length());
			// if position is last index.
		} else if (position == length - 1) {
			return delete();
			// if position is first index.
		} else if (position == 0) {
			return deleteFirst();
			// position is in required range.
		} else {
			Node1<G> previous = null;
			for (int i = 0; i < position; i++) {
				previous = current;
				current = current.next;
			}
			G removedData = current.next.data;
			previous.next = current.next;
			length--;
			return removedData;
		}
	}

	
	 // Takes data of generic type as input and search the valid index position
	 
	public void deleteData(G data) {
		if (getIndex(data) < 0) {
			System.out.println("Opps! Data not found...");
		} else {
			delete(getIndex(data));
		}
	}

	
	 // Takes data of generic type and iterate in the loop checks all data
	
	 
	public boolean search(G data) {
		if (isEmpty()) {
			return false;
		} else {
			Node1<G> current = head;
			while (current.next != null) {
				if (current.data.equals(data)) {
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	
	 // It takes the generic data type as input and checks for index position
	 
	public int getIndex(G data) {
		if (isEmpty()) {
			return -1;
		} else {
			int dataIndexPosition = 0;
			Node1<G> current = head;
			while (current != null) {
				if (current.data.equals(data)) {
					return dataIndexPosition;
				}
				dataIndexPosition++;
				current = current.next;
			}
		}
		return -1;
	}

}
