package sll;


/*
 * A linked list class for storing Integers
 */
public class SinglyLinkedList {

	private class Node {
		public Node(Integer data, Node next) {
			this.data = data;
			this.next = next;
		}
		public Integer data;
		public Node next;
	}
	
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}

	/**
	 * tripleTheFun
	 * 
	 * Given a SinglyLinkedList, after each node in the list, 
	 * add two more nodes with the same value right after it.
	 * 
	 * For example, on the lists,
	 * [1 -> 7 -> 4 -> 9 -> 2].tripleTheFun() yields 
	 * 			[1 -> 1 -> 1 -> 7 -> 7 -> 7 -> 4 -> 4 -> 4 -> 9 -> 9 -> 9 -> 2 -> 2 -> 2]
	 * [1].tripleTheFun() yields [1 -> 1 -> 1]
	 * [].tripleTheFun() yields []
	 * 
	 * Note:  By "yields" we mean the method alters the linked
	 * list.  The return value of the function is actually void.
	 * Note that we don't need to input the linked list to the
	 * method, because they are part of the same class here.
	 */
	public void tripleTheFun() {
		Node currentNode = this.first;
		
		while(currentNode!=null) {
			int val = currentNode.data;
			Node newNode2 = new Node(val,currentNode.next);
			Node newNode1 = new Node(val,newNode2);
			currentNode.next = newNode1;
			
			currentNode = currentNode.next.next.next;
		}

	}
	
	
	/**
	 * 
	 * moveToTheEnd
	 * 
	 * Given a SinglyLinkedList, move all the nodes with
	 * a given value to the end of the list.
	 * 
	 * For example, on the lists,
	 *  [1 -> 7 -> 4 -> 9 -> 2].moveToTheEnd(7) yields [1 -> 4 -> 9 -> 2 -> 7]
	 *  [7 -> 7 -> 4 -> 9 -> 2].moveToTheEnd(7) yields [4 -> 9 -> 2 -> 7 -> 7]
	 *  [5 -> 5].moveToTheEnd(5) yields [5 -> 5]
	 *  [7 -> 7 -> 4 -> 9 -> 2].moveToTheEnd(5) yields [7 -> 7 -> 4 -> 9 -> 2]
	 *  [].moveToTheEnd(5) yields []
	 *  
	 */
	
	public void moveToTheEnd( Integer value) {
		Node current = this.first;
		Node previous = this.first;
		Node end = new Node(value, null);
//		int count = 0;
//		int position = 0;
		
		if(this.toString().contentEquals(value.toString()));
		{
			while(current!=null ) {
				if(current == this.first && current.data == value) {
					this.first = current.next;
				}
				else if(current.data == value) {
					previous.next = current.next;
				}
				previous = current;
				current  = current.next;
				if(current.next == null) {
					current.next = end;
					return;
				}
			}
		}
//		count = 0;
//		Node previous = this.first;
//		Node current2 = this.first;
//		while(current!=null) {
//			if(position == count-1) {
//				previous = current2;
//			}
//			if(position == count) {
//				previous.next = current.next;
//			}
//			count++;
//			current = current.next;
//		}

	}

	/**
	 * switchExtremes
	 * 
	 * Given a SinglyLinkedList, swap the values of the nodes with the 
	 * largest and smallest values.  If there are multiple
	 * occurrences of either, swap all the extremes.
	 * 
	 * For example, on the lists, 
	 * [1 -> 7 -> 4 -> 9 -> 2].switchExtremes() yields [9 -> 7 -> 4 -> 1 -> 2]
	 * [2 -> 9 -> 4 -> 9 -> 2].switchExtremes() yields [9 -> 2 -> 4 -> 2 -> 9]
	 * [5].switchExtremes() yields [5]
	 * [].switchExtremes() yields []
	 * 
	 */
	public void switchExtremes() {
		int max = 0;
		int min = 100;
		Node current = this.first;
		
		while(current!=null) {
			if(current.data > max) {
				max = current.data;
			}if(current.data < min) { 
				min = current.data;
			}
			current = current.next;
		}
	}
	
	///////////////////////////////////////////
	//DO NOT CHANGE ANYTHING BELOW THIS LINE //
	///////////////////////////////////////////
	
	/**
	 * returns a String representation of the list
	 * 
	 * Don't change this! It is used by the unit tests.
	 * 
	 */
	@Override
	public String toString() {
		// Don't change this! It is used by the unit tests.
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		Node current = this.first;
		while (current.next != null) {
			result += (current.data + "->");
			current = current.next;
		}
		result += current.data+ "] first=["+this.first.data +"]";
		return result;
	}


	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Don't change this! It is used by the unit tests.
	 * 
	 */
	public void addFirst(Integer newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}



}

