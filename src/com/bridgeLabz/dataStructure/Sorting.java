package com.bridgeLabz.dataStructure;

import java.util.List;

/*
  all type of sorting algorithms. bubble sort , merge sort, insertion sort and
  all of generic type insertionSort. 
 */
public class Sorting {
	
	public static String[] insertionSort(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int valueToSort = array[i];
			int j = i;
			
			while (j > 0 && array[j - 1] > valueToSort) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = valueToSort;
		}
		return array;
	}

	/*
	  largest element of unsorted part will bubble up to the largest index of
	  unsorted part.

	 */
	public static int[] bubbleSort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap temporary variable and array[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;

	}

	/*
	 * swap first element with second element and store it in a List of any type.

	 */
	private static <G extends Comparable<G>> void swap(List<G> list, int firstPos, int secondPos) {
		G temp = list.get(firstPos);
		list.set(firstPos, list.get(secondPos));
		list.set(secondPos, temp);
	}


	public static <G extends Comparable<G>> List<G> selectionSort(List<G> list) {
		for (int i = 0; i < list.size(); i++) {
			int minPos = -1;
			G minValue = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				G secondPosition = list.get(j);
				/*
				  works by returning an integer value that is either positive, negative, or
				  zero. It compares the object by making the call to the object that is the
				  argument
				*/
				if (minValue.compareTo(secondPosition) > 0) {
					minPos = j;
					minValue = list.get(j);
				}
			}
			/*
			  if minimum value returned is greater than 0 it swap the searching element
			  with minimum position.
			 */
			if (minPos >= 0) {
				swap(list, i, minPos);
			}
		}
		return list;
	}

}