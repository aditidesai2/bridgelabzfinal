package com.bridgeLabz.dataStructure;

/*
   Read the file from a source and split it on the basis of comma and
   transferred all data to the Linked List of generic type and some addition
   deletion operations are done. Whole list is transfered to another document.

 */
public class unorderedlist {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		String[] array = Util.readFile("//Users//rmddesai//Desktop//java.txt").split(",");
		for (String str : array) {
			list.insert(str);
		}
		list.print();
		System.out.println("Please insert String data for insertion operation :");
		String inputData = Util.scanner.nextLine();
		list.insert(inputData);
		System.out.println("Please insert String data for insertion operation and position :");
		list.insert(Util.scanner.nextLine(), Util.scanner.nextInt());

		System.out.println(list.length());
		System.out.println(list.printString());

		Util.writeToFile(list.printString(), "//Users//rmddesai//Desktop//java.txt");

	}

}
