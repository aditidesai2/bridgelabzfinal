package com.bridgeLabz.objectOriented.addressBook.serviceImplementation;

import java.util.ArrayList;

import com.bridgeLabz.objectOriented.addressBook.model.Contact;
import com.bridgeLabz.objectOriented.addressBook.service.IAddressBookOperations;
import com.bridgeLabz.utility.UtilJson;

//import com.bridgeLabz.dataStructure.LinkedList;


public class AddressBookOperations implements IAddressBookOperations {
	public String addressBookName;
	public ArrayList<Contact> addressBook;

	
	public AddressBookOperations() {
		//this.addressBookName = addressBookName;
		addressBook = new ArrayList<Contact>();
	}

	
	public String getAddressBookName() {
		return addressBookName;
	}

	
	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}

	@Override
	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getFirstName()) >= 0) {
			System.out.println("Contact already exists");
			return false;
		} else {
			addressBook.add(contact);
			return true;
		}
	}

	//returns index value of contact
	private int findContact(Contact contact) {
		return this.addressBook.indexOf(contact);
	}
	
	
	
public int findContact(String firstName) {
		for (int i = 0; i < addressBook.size(); i++) {
			Contact fetchedContact = this.addressBook.get(i);
			if (fetchedContact.getFirstName().equals(firstName)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0) {
			System.out.println(oldContact.toString() + " was not found");
		}
		this.addressBook.set(foundPosition, newContact);
		System.out.println(oldContact.getFirstName() + " updated successfully ");
		return true;
	}

	
	public String searchContact(Contact contact) {
		if (findContact(contact) >= 0) {
			return contact.toString();
		}
		return null;
	}


	public Contact searchContact(String firstName) {
		int position = findContact(firstName);
		if (position >= 0) {
			return this.addressBook.get(position);
		}
		return null;
	}

@Override
	public boolean deleteContact(Contact contact) {
		int foundPosition = findContact(contact);
		if (foundPosition < 0) {
			System.out.println(contact.toString() + " was not found!");
			return false;
		}
		this.addressBook.remove(foundPosition);
		System.out.println(contact.toString() + " successfully deleted");
		return true;
	}

	
	public String printIndetailContact() {
		System.out.println("contact list :");
	//	for (int i = 0; i < addressBook.size(); i++) {
	//		System.out.println((i + 1) + ". First Name : " + addressBook.get(i).getFirstName() + "\n   Last Name : "
	//				+ addressBook.get(i).getLastName() + "\n   Address : " + addressBook.get(i).getAddress()
	//				+ "\n   Email id : " + addressBook.get(i).getEmail() + "\n   mobile no : "
	//				+ addressBook.get(i).getPhoneNumber());
	//	}
		int addressCount = 0;
		addressBook.forEach(i -> System.out.println((addressCount + 1) + ". First Name -> " + i.getFirstName()
				+ "\n   Last Name -> " + i.getLastName() + "\n   Address -> " + i.getAddress() + "\n   Email id -> "
				+ i.getEmail() + "\n   mobile no -> " + i.getPhoneNumber()));
		return addressBookName;
	}

	//prints complete name
	public void printFullName() {
	//	System.out.println("contact list :");
	//	for (int i = 0; i < addressBook.size(); i++) {
	//		System.out.println((i + 1) + " . " + addressBook.get(i).toString());
	//	}
		
		int addressCount = 0;
		addressBook.forEach(i -> System.out.println((addressCount + 1) + ". First Name -> " + i.getFirstName()
				+ "\n   Last Name -> " + i.getLastName()));
	}
	
	@Override
	public String writeDataToJson() {
		String addressBookJson = UtilJson.convertObjectToJson(addressBook);
		return addressBookJson;
	}

}


