package sll;

import org.w3c.dom.Element;

/**
 * This class provides a basic implementation of a singly linked list. It's
 * motivated by the implementation in Big Java, 5e, ch. 16.1.
 * 
 * @author TODO Jordan Asman on 5/2/19.
 */
public class SinglyLinkedList implements ILinkedList
{

	/**
	 * Note that in addition to a head (first) pointer this list contains a last
	 * pointer. Be sure to BOTH first and last up to date in all your code.
	 */
	private ListNode first;
	private ListNode last;

	/**
	 * These are needed for the test code.
	 */
	@Override
	public IListNode getFirst()
	{
		return first;
	}

	@Override
	public IListNode getLast()
	{
		return last;
	}

	@Override
	public void setFirst(IListNode first)
	{
		this.first = (ListNode) first;
	}

	@Override
	public void setLast(IListNode last)
	{
		this.last = (ListNode) last;
	}

	/**
	 * Constructs a new, empty linked list.
	 */
	public SinglyLinkedList()
	{
		this.first = null;
		this.last = null;
	}

	@Override
	public String toString()
	{
		if (this.first == null)
		{
			return "[]";
		}
		String result = "[";
		ListNode current = this.first;
		// while (current != this.last) {
		while (current.next != null)
		{
			result += (current.element + ", ");
			current = current.next;
		}
		result += current.element + "] first=[" + this.first.getElement() + "] last=[" + this.last.getElement() + "]";
		return result;
	}

	/**
	 * WARNING: add(Integer element) must be completed before OTHER tests can pass!
	 * 
	 * Make sure to complete this method FIRST before trying the other ones.
	 * 
	 * This method should add the given element to the end of this list.
	 */
	@Override
	public void add(Integer element)
	{
		ListNode a = new ListNode(element);

		if (this.getLast() == null)
		{
			setFirst(a);
			setLast(a);
		}
		else
		{
			this.last.setNext(a);
			setLast(a);
		}
		// TODO 01 Implement the add(Integer element) method.
	}

	/**
	 * WARNING: add(Integer element) must be completed before this test can pass!
	 * 
	 * This method should return the number of elements in the list.
	 */
	@Override
	public Integer size()
	{
		Integer count = 1;
		ListNode a = this.first;
		if (this.first == null)
		{
			count = 0;
		}
		while (a != this.last)
		{
			count++;
			a = (ListNode) a.getNext();
		}
		return count;
	}

	/**
	 * This method should insert the given element at the given index in the list.
	 * This DOES NOT replace the element at an index, but inserts an element.
	 * 
	 * If you are passed an invalid index you should throw an
	 * IndexOutOfBoundsException.
	 * 
	 * Note that this inserts a value at the specific index NOT a value. Please also
	 * note that it is LEGAL to insert at the END of the list.
	 * 
	 * Examples: [2, 6] -> insertAtIndex(1, 7) -> [2, 7, 6] [2, 7, 6] ->
	 * insertAtIndex(0, 8) -> [8, 2, 7, 6] [8, 2, 7, 6] -> insertAtIndex(4, 9) ->
	 * [8, 2, 7, 6, 9] ^ ^ ^ ^ ^ | | | | | 0 1 2 3 4 <- indices
	 */
	@Override
	public void insertAtIndex(int index, Integer element) throws IndexOutOfBoundsException
	{
		ListNode a = this.first;
		ListNode b = new ListNode();
		ListNode myNode = new ListNode(element);
		int size = this.size();

		if (size < index)
		{
			throw new IndexOutOfBoundsException();
		}

		if (size == 0)
		{
			this.first = myNode;
			this.last = myNode;
		}
		else if (size == 1)
		{
			if (index == 0)
			{
				this.first = myNode;
				myNode.next = a;
			}
			else
			{
				a.next = myNode;
			}
		}
		else
		{
			if (index == 0)
			{
				this.first = myNode;
				b = (ListNode) a.getNext();
				myNode.setNext(a);
				a.setNext(b);
			}
			else
			{
				for (int i = 0; i < index + 1; i++)
				{
					if (i == index - 1)
					{
						b = (ListNode) a.getNext();
						a.setNext(myNode);
						myNode.setNext(b);
					}
					a = (ListNode) a.getNext();
				}
				if (index == size)
					this.last = myNode;
			}
		}
	}

	/**
	 * This method should return true if the list contains the given element and
	 * false if it does not.
	 * 
	 */
	@Override
	public boolean contains(Integer element)
	{
		ListNode a = this.first;
		int size = this.size();
		if (size > 0)
		{
			for (int i = 0; i < size; i++)
			{
				if (i < size - 1)
				{
					if (this.getFirst().getElement() == element)
						return true;
					else
					{
						if (a.next.getElement() == element)
							return true;
						a = a.next;
					}
				}
				else
				{
					if (this.getLast().getElement() == element)
						return true;
				}

			}
			return false;
		}
		return false;
	}

	/**
	 * This method should attempt to remove the FIRST occurrence of the given
	 * element in the list.
	 * 
	 * If the element is found and removed, return true otherwise if the element is
	 * not found, then return false.
	 */
	@Override
	public boolean remove(Integer element)
	{
		ListNode currentNode = this.first;
		int size = size();

		for (int i = 0; i < size; i++)
		{
			if (this.first.getElement() == element)
			{
				this.first = (ListNode) currentNode.getNext();
				return true;
			}
			else if (i < size - 1 && currentNode.getNext().getElement() == element)
			{
				ListNode b = (ListNode) currentNode.getNext().getNext();
				if (currentNode.getNext() == this.last)
					this.last = currentNode;
				currentNode.setNext(b);
				return true;
			}
			else
			{

			}
			currentNode = (ListNode) currentNode.getNext();
		}
		// TODO 05 Implement the remove(Integer element) method
		return false;
	}

	/**
	 * This method should return the index of the FIRST occurrence of the given
	 * element, OR -1 if the element is not found in the list.
	 * 
	 */
	@Override
	public int indexOf(Integer element)
	{
		int count = 0;
		int size = size();
		ListNode a = this.first;

		if (size > 0)
		{
			for (int i = 0; i < size; i++)
			{
				if (a.getElement() == element)
				{
					return count;
				}
				count++;
				a = (ListNode) a.getNext();
			}
		}
		return -1;
	}

	/**
	 * Replaces the element at the given index with the new element. RETURNS the OLD
	 * element.
	 * 
	 * The method should throw an IndexOutOfBoundsException if an invalid index is
	 * provided.
	 */
	@Override
	public Integer set(int index, Integer element) throws IndexOutOfBoundsException
	{
		int oldElement = 0;
		ListNode a = this.first;
		ListNode myNode = new ListNode(element);
		int size = size();

		if (size == 0 || size < index || index < 0)
			throw new IndexOutOfBoundsException();
		else
		{
			for (int i = 0; i < size + 1; i++)
			{
				if (index == 0)
				{
					ListNode b = (ListNode) this.first.getNext();
					oldElement = this.first.getElement();
					this.first = myNode;
					myNode.setNext(b);
					return oldElement;
				}
				else if (i + 1 == index)
				{
					if (index == size - 1)
					{
						oldElement = this.last.getElement();
						this.last = myNode;
						a.setNext(myNode);
						return oldElement;
					}
					else
					{
						oldElement = a.getNext().getElement();
						ListNode b = (ListNode) a.getNext().getNext();
						a.setNext(myNode);
						myNode.setNext(b);
						return oldElement;
					}
				}
				a = (ListNode) a.getNext();
			}
		}
		return -1;
	}
}
