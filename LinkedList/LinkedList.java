import java.util.Collection;
public class LinkedList<T extends Comparable<T>>
{
	Node<T> head;
	Node<T> last;
	int size = 0;
	//constructor for empty LinkedList
	public LinkedList()
	{
		head = null;
		last = null;
	}
	//return true if the LinkedList contains the specified element
	public boolean contains(T x)
	{
		Node current = head;
		while(current != null)
		{
			if(current.data == x)
				return true;
			current = current.next;
		}
		return false;
	}
	//add the specified element to the end of the LinkedList
	public void add(T x)
	{
		Node node = new Node(x);
		if(head == null)
		{
			head = node;
			last = node;
		}
		else
			last.next = node;
			last = node;
		size++;
	}
	//remove all the members of the LinkedList
	public void clear()
	{
		head = null;
		size = 0;
	}
	//return the data of the first element in the LinkedList
	public T getFirst() 
	{
		return head.data;
	}
	//return the data of the last element in the LinkedList
	public T getLast()
	{
		return last.data;
	}
	//return the data in the specified index
	public T get(int index)
	{
		if(index >= size)
		{
			System.out.println("Invalid Index");
		}
		if(index == 0)
		{
			return head.data;
		}
		else
		{
			Node<T> current = head;
			int i = 0;
			while(i < index)
			{
				current = current.next;
				i++;
			}
			return current.data;			
		}
	}
	//return the size of the LinkedList
	public int size()
	{
		return size;
	}
	//insert the specified value at the given index in the LinkedList 
	public void insert(T x , int index)
	{
		if(index >= size)
		{
			System.out.println("Invalid Index");
			return;
		}
		Node node = new Node(x);
		if(index == 0)
		{
			node.next = head;
			head = node;
		}
		else
		{
			Node current = head;
			int i = 0;
			while(i < index - 1)
			{
				current = current.next;
				i++;
			}
			node.next = current.next;
			current.next = node;
		}
		if(index == size - 1)
			last = node;
		size++;
	}
	//changes the value at the given index to the specified value
	public void set(T x , int index)
	{
		if(index >= size)
		{
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0)
		{
			head.data = x;
		}
		else
		{
			Node current = head;
			int i = 0;
			while(i < index)
			{
				current = current.next;
				i++;
			}
			current.data = x;
		}
	}
	//remove the element at the given in dex in the LinkedList
	public void remove(int index)
	{
		Node<T> current = head;
		Node<T> previous = head;
		if(index >= size)
		{
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			int i = 0;
			while(i < index)
			{
				previous = current;
				current = current.next;
				i++;
			}
			previous.next = current.next;			
		}
		if(index == size - 1)
			last = previous;
		size--;
	}
	//remove the first element of the LinkedList
	public void removeFirst()
	{
		head = head.next;
		size--;
		if(size == 0)
			last = null;
	}
	//remove the last element of the LinkedList
	public void removeLast()
	{
		this.remove(size - 1);		
	}
}