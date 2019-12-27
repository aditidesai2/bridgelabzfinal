package com.bridgeLabz.objectOriented.addressBook.controller;
import com.bridgeLabz.objectOriented.addressBook.model.Contact;
import com.bridgeLabz.objectOriented.addressBook.service.IAddressBookOperations;
import com.bridgeLabz.objectOriented.addressBook.serviceImplementation.AddressBookOperations;
import com.bridgeLabz.utility.Util;

/**
 * This class is the main implementation of the address book class which bears
 * the functionality of adding a contact updating a contact , deleting a contact
 * from directory, searching a contact on basis of first name, quit application
 * and displaying inDetail information of the contact. This class allow the user
 * to implement above functionality by pressing the keys mentioned in the
 * working directory . After user uses the application all data were written to
 * the JSON file.
 * 
 * @author Aditi Desai
 * @created 2019-12-1
 * @modified 2019-12-12
 * @updated -> allows user to update on basis of email, phone number, address.
 * @version 11.0.5
 */
public class AddressBook {
	
	private static IAddressBookOperations myAddressBook = new AddressBookOperations();


	public static void main(String[] args) {
	
		System.out.println("Welcome to address book!\nAvailable actions :\npress :\n\t1. Quit the application.\n\t2. Add a new contact.\n"
				+ "\t3. Update an existing contact.\n" + "\t4. Remove an existing contact.\n"
				+ "\t5. Search a contact from the book.\n" + "\t6. Print in detail address book.\n"
				+ "\t7. Print contact full name only.\n" + "\t8. Print instructions\nEnter required option :");
		
		boolean quit = false;
		while (!quit) {
			System.out.println("\nEnter required option (Enter : 8. to show available actions)");
			int choice = Util.scanner.nextInt();
			switch (choice) {
			case 1:
				quit = true;
				System.out.println("Thank you  for using application");
				break;

			case 2:
				System.out.println("Enter First Name :");
				String firstName = Util.scanner.next();
				Util.scanner.nextLine();
				System.out.println("Enter Last Name :");
				String lastName = Util.scanner.next();
				Util.scanner.nextLine();
				System.out.println("Enter Email id :");
				String email = Util.scanner.next();
				Util.scanner.nextLine();
				System.out.println("Enter address :");
				String address = Util.scanner.next();
				Util.scanner.nextLine();
				System.out.println("Enter phone Number :");
				Long phoneNumber = Util.scanner.nextLong();
				Util.scanner.nextLine();

				Contact newContact = Contact.createContact(firstName, lastName, email, address, phoneNumber);
				if (myAddressBook.addNewContact(newContact)) {
					System.out.println("New contact " + firstName + " added successfully.");

				} else {
					System.out.println("cannot add " + firstName + " already on file.");
				}
				
				Util.writeToFile(myAddressBook.writeDataToJson(), "jsonAddressBook.json⁩");
				break;

			case 3:
				System.out.println("Enter existing contact first Name :");
				String existingContactFirstName = Util.scanner.next();
				Contact existingContactRecord = myAddressBook.searchContact(existingContactFirstName);
				if (existingContactRecord == null) {
					System.out.println("Contact not found!");
					return;
				}
				 firstName = existingContactRecord.getFirstName();
				 lastName = existingContactRecord.getLastName();
				System.out.println("Enter Email id :");
				 email = Util.scanner.next();
				System.out.println("Enter address :");
				 address = Util.scanner.next();
				System.out.println("Enter phone Number :");
				 phoneNumber = Util.scanner.nextLong();
				 newContact = Contact.createContact(firstName, lastName, email, address, phoneNumber);
				if (myAddressBook.updateContact(existingContactRecord, newContact)) {
					System.out.println("Record updated succesfully.");
				} else {
					System.out.println("Error updating record");
				}
				
				Util.writeToFile(myAddressBook.writeDataToJson(), "jsonAddressBook.json⁩");
				break;

			case 4:
				System.out.println("Enter first Name of contact you want to delete :");
				 existingContactFirstName = Util.scanner.next();
				 existingContactRecord = myAddressBook.searchContact(existingContactFirstName);
				if (existingContactRecord == null) {
					System.out.println("Contact not found!");
					return;
				}

				if (myAddressBook.deleteContact(existingContactRecord)) {
					System.out.println("Successfully deleted.");
				} else {
					System.out.println("error deleting record!");
				}
				
				Util.writeToFile(myAddressBook.writeDataToJson(), "jsonAddressBook.json⁩");
				break;
				

			case 5:
				System.out.println("Enter first Name of contact you want search :");
				String contactFirstName = Util.scanner.next();
				 existingContactRecord = myAddressBook.searchContact(contactFirstName);
				if (existingContactRecord == null) {
					System.out.println("Contact not found!");
					return;
				}
				System.out.println("  First Name: " + existingContactRecord.getFirstName() + "\n  Last Name : "
						+ existingContactRecord.getLastName() + "\n  Address: " + existingContactRecord.getAddress()
						+ "\n  Email id: " + existingContactRecord.getEmail() + "\n  mobile no: "
						+ existingContactRecord.getPhoneNumber());
				
				break;

			case 6:
				myAddressBook.printIndetailContact();
				break;

			case 7:
				myAddressBook.printFullName();
				break;

			case 8:
				System.out.println("Available actions :\npress :\n\t1. Quit the application.\n" + "\t2. Add a new contact.\n"
						+ "\t3. Update an existing contact.\n" + "\t4. Remove an existing contact.\n"
						+ "\t5. Search a contact from the book.\n" + "\t6. Print in detail address book.\n"
						+ "\t7. Print contact full name only.\n" + "\t8. Print instructions.");
				System.out.println("Choose required option :");
				
				break;

			default:
				System.out.println("Please read instructions!");
			}
		}

	}

}