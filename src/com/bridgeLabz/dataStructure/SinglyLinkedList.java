package com.bridgeLabz.dataStructure;
/*
   This class extends common elements class to override print method and
   implements interface to get print method and this class has some method's
   like insertAtStart => to insert element at start. insertAtLast => to insert
   the element at last. insertAtPosition => to insert the element at particular
   position. deleteAtStart => to delete element at start. deleteAtLast => to
   delete the element at last. deleteAtPosition => to delete the element at
   particular position. search => to find whether the searching data is present
   or not in the list
 
 *
 */

public class SinglyLinkedList extends CommonElements implements ICommon {

	private Node head;

	
	@Override
	public void print() {
		if (head == null) {
			System.out.println("List is Empty!");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println("null");
		}

	}

	
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}


	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			length++;
		}
	}


	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if (position == 0) {
			// as this condition satisfies the insertion at beginning.
			insertAtStart(data);
		} else if (position >= length()) {
			// inserting at the position greater than length of the list.
			System.out.println("Insertion at position " + position + " is not possible...");
		} else if (position < 0) {
			// inserting at negative index of the list.
			System.out.println("Invalid position!");
		} else if (position == length() - 1) {
			// inserting at the position equals with the list length
			insertAtLast(data);
		} else {
			Node current = head;

			for (int i = 0; i < position - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			length++;
		}
	}


	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("Deletion not possible...");
		} else {
			head = head.next;
			length--;
		}
	}


	public void deleteLast() {
		if (isEmpty()) {
			// checks if the list is empty.
			System.out.println("Deletion not possible...");
		} else if (length() == 1) {
			// checks if the list has only one node
			head = null;
			length--;
		} else {
			Node current = head;
		
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
			length--;
		}
	}

	
	public void deleteFromPosition(int position) {
		if (position < 0) {
			// deleting at negative index of the list.
			System.out.println("Invalid position...");
		} else if (position == 0) {
			// as this condition satisfies the deletion at beginning.
			deleteFirst();
		} else if (position == length() - 1) {
			// inserting at the position equals with the list length
			deleteLast();
		} else if (position >= length()) {
			// inserting at the position greater than length of the list.
			System.out.println("Deletion at position " + position + " is not possible...");
		} else {
			Node current = head;
			Node previous = head;
			
			for (int i = 0; i < position; i++) {
				previous = current;
				current = current.next;
			}
			previous.next = current.next;
			length--;
		}
	}


	public boolean search(int inputData) {
		Node current = head;
	
		while (current != null) {
			if (current.data == inputData) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

}