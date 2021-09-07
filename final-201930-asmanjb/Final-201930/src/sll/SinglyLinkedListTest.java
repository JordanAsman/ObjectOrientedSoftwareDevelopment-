package sll;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

	SinglyLinkedList list;

	@Before
	public void setUp() {
		this.list = new SinglyLinkedList();
	}

	/*
	 * Populates the list with the items in the given array, in the order
	 * they're given in the array.
	 */
	private void populateList(SinglyLinkedList list, Integer[] items) {
		for (int i = items.length - 1; i >= 0; i--) {
			list.addFirst(items[i]);
		}
	}

	@After
	public void tearDown() throws Exception {
		this.list = null;
	}
	
	
	@Test
	public void testTripleTheFun() {
		
		//first test - regular list
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 1,7,4,9,2 });
		this.list.tripleTheFun();
		assertEquals("[1->1->1->7->7->7->4->4->4->9->9->9->2->2->2] first=[1]", this.list.toString() );
		
		//second test - single element
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 1 });
		this.list.tripleTheFun();
		assertEquals("[1->1->1] first=[1]", this.list.toString() );
		
		//third test - empty list
		this.list = new SinglyLinkedList();
		this.list.tripleTheFun();
		assertEquals("[]", this.list.toString() );
		
	}
	
	
	@Test
	public void testMoveToTheEnd() {
		
		//target node in middle
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 1,7,4,9,2 });
		this.list.moveToTheEnd(7);
		assertEquals("[1->4->9->2->7] first=[1]", this.list.toString() );
		
		//list starts with double target nodes
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 7,7,4,9,2 });
		this.list.moveToTheEnd(7);
		assertEquals("[4->9->2->7->7] first=[4]", this.list.toString() );
				
		//list contains only target nodes
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 5,5 });
		this.list.moveToTheEnd(5);
		assertEquals("[5->5] first=[5]", this.list.toString() );
				
		//list doesn't have the target node
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 7,7,4,9,2 });
		this.list.moveToTheEnd(5);
		assertEquals("[7->7->4->9->2] first=[7]", this.list.toString() );
				
		//empty list
		this.list = new SinglyLinkedList();
		this.list.moveToTheEnd(5);
		assertEquals("[]", this.list.toString() );
			
	}
	
	@Test
	public void testSwitchExtremes() {
		
		//one extreme at head, other in the middle
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 1,7,4,9,2 });
		this.list.switchExtremes();
		assertEquals("[9->7->4->1->2] first=[9]", this.list.toString() );
			
		//duplicates of both extremes
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 2,9,4,9,2 });
		this.list.switchExtremes();
		assertEquals("[9->2->4->2->9] first=[9]", this.list.toString() );
			
		//single element list
		this.list = new SinglyLinkedList();
		populateList(this.list, new Integer[] { 5 });
		this.list.switchExtremes();
		assertEquals("[5] first=[5]", this.list.toString() );
			
		//empty list
		this.list = new SinglyLinkedList();
		this.list.switchExtremes();
		assertEquals("[]", this.list.toString() );
			
	}
	
	
}
