package sll.algorithms;

import java.util.ArrayList;

import sll.ILinkedList;
import sll.IListNode;
import sll.ListNode;
import sll.SinglyLinkedList;

// TODO: complete sll.SinglyLinkedList first, then use it to complete these problems.
public class Algorithms
{
	/**
	 * 
	 * Write a function that takes an array of integers and returns a linked list.
	 * The linked list should contain only the integers in the original list that
	 * begin with the number 1.
	 * 
	 * So arraylistOf1s({123,456,1, 21}) yields [123, 1]
	 */
	public static SinglyLinkedList arraylistOf1s(int[] integers)
	{
		SinglyLinkedList myList = new SinglyLinkedList();
		
		for(int i=0;i<integers.length;i++)
		{
			String num = Integer.toString(integers[i]);
			if(num.substring(0,1).contentEquals("1")) {
				myList.add(integers[i]);
			}
		}
		return myList;
	}

	/**
	 * Takes a list of numbers in sorted (ascending) order and a number to add.
	 * 
	 * Adds the number in the correct place in the sorted list.
	 * 
	 * so insertIntoSorted([1,5,9],6) yields [1,5,6,9]
	 * 
	 */
	public static void insertIntoSorted(ILinkedList list, int number)
	{
		int size = list.size();
		ListNode a = (ListNode) list.getFirst();
		
		if(size == 0)
		{
			list.insertAtIndex(0, number);
		}
		for(int i=0;i<size;i++)
		{
			if(size == 1)
			{
				if(list.getFirst().getElement() > number)
					list.insertAtIndex(0, number);
				else
					list.insertAtIndex(1, number);
			}
			else if(i+1==size)
			{
				if(a.getElement() > number)
				{
					list.insertAtIndex(i, number);
				}
				else {
					list.add(number);
				}
			}
			else if(a.getNext().getElement() > number)
			{
				list.insertAtIndex(i+1,number);
				return;
			}
			a = (ListNode) a.getNext();
		}
	}

	/**
	 * Takes a linked list and removes all numbers longer than 3 digits from the
	 * list.
	 * 
	 * So removeLongNumbers([1,1000,3,99999,999]) yields [1, 3, 999]
	 */
	public static void removeLongNumbers(ILinkedList list)
	{
		int size = list.size();
		ListNode a = (ListNode) list.getFirst();
		for(int i=0;i<size;i++)
		{
			if(a.getElement() > 999)
			{
				list.remove(a.getElement());
			}
			a = (ListNode) a.getNext();
		}
	}

	/**
	 * Returns whether the given linked list is sorted in increasing order.
	 * 
	 * So checkSorted([1,2,3]) yields true. checkSorted ([1,3,2]) yields false.
	 * checkSorted ([]) yields true.
	 */
	public static boolean checkSorted(ILinkedList list)
	{
		ListNode a = (ListNode) list.getFirst();
		int size = list.size();
		
		if(size == 0 || size == 1)
			return true;
		else {
			for(int i=0;i<size;i++)
			{
				if(i < size - 1)
				{
					if(a.getElement() > a.getNext().getElement())
						return false;
				}
				a = (ListNode) a.getNext();
			}
			return true;
		}
	}

	/**
	 * Duplicates all elements of the list.
	 * 
	 * So doubleList([1, 2, 3]) yields [1, 1, 2, 2, 3, 3].
	 */
	public static void doubleList(ILinkedList list)
	{
		int size = list.size();
		ListNode a = (ListNode) list.getFirst();
		
		for(int i=0;i<size*2;i=i+2)
		{
			list.insertAtIndex(i+1, a.getElement());
			a = (ListNode) a.getNext().getNext();
		}
	}

	/**
	 * Returns whether the list represents a Fibonacci sequence.
	 * 
	 * Recall: fib(i) = fib(i-1) + fib(i-2)
	 * 
	 * [0,1] is too short to be a fibonacci sequence. [1,2,3] is a fibonacci
	 * sequence because 3 = 2 + 1. [0,1,1] is a fibonacci sequence because 1 = 1 +
	 * 0. [1,4,5,9,14] is a fibonacci sequence.
	 */
	public static boolean isFibonacciSequence(ILinkedList list)
	{
		int size = list.size();
		ListNode a = (ListNode) list.getFirst();
		
		if(size <= 2)
		{
			return false;
		}
		else
		{
			for(int i=0;i<size-2;i++)
			{
				if(a.getElement()+a.getNext().getElement() != a.getNext().getNext().getElement())
				{
					return false;
				}
				a = (ListNode) a.getNext();
			}
		}
		return true;
	}

	/**
	 * Gets the value of the ith node.
	 * 
	 * If i==0, return the value of the given node.
	 * 
	 * If you are passed an invalid index you should throw an
	 * IndexOutOfBoundsException.
	 * 
	 */
	public static Integer recursiveGet(int index, IListNode iListNode)
	{
		if(index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		if(index == 0)
		{
			if(null == iListNode)
			{
				throw new IndexOutOfBoundsException();
			}
			else
				return iListNode.getElement();
		}
		else
			return recursiveGet(index-1,iListNode.getNext());
	}

}
