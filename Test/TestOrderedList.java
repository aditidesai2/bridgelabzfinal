

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgeLabz.dataStructure.LinkedList;
import com.bridgeLabz.dataStructure.OrderedList;

public class TestOrderedList {
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Test
	public void test_orderedList_RemoveOperation_whenValueIsPresentInList() {
		list.insert(21);
		list.insert(22);
		list.insert(23);
		list.insert(24);
		OrderedList.addRemoveOperation(24, list);
		assertFalse(list.search(24));

	}
	
	
	@Test
	public void test_orderedList_RemoveOperation_atLastValue_whenValueIsPresentInList() {
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		OrderedList.addRemoveOperation(40, list);
		assertFalse(list.search(40));

	}

	@Test
	public void test_orderedList_AdditionOperation_atLast_whenValueNotPresentInList() {
		list.insert(10);
		list.insert(20);
		OrderedList.addRemoveOperation(40, list);
		list.insert(50);
		assertTrue(list.search(20));
	}

	@Test
	public void test_orderedList_AdditionOperation_whenValueNotPresentInList() {
		list.insert(10);
		list.insert(20);
		OrderedList.addRemoveOperation(40, list);
		assertTrue(list.search(40));
	}
	
	@Test
	public void test_orderedList_AdditionOperation_atStart_whenListIsEmpty() {
		
		OrderedList.addRemoveOperation(40, list);
		assertTrue(list.search(40));
	}


}