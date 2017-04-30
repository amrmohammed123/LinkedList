public class TestLinkedList
{
	public static void main(String[] args)
	{
		testConstructors();
		testAdd();
		testContains();
		testRemove();
		testGetFirst();
		testGetLast();
		testInsert();
		testSet();
		testSize();
		testClear();
		testRemoveLast();
		testRemoveFirst();
	}
	public static void testConstructors()
	{
		LinkedList<Integer> list = new LinkedList<>();
		if(list.head != null)
		{
			System.out.println("There is a problem with the Constructors");
			return;
		}
		System.out.println("Good");		
	}
	public static void testAdd()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		if(list.head.data != 100)
		{
			System.out.println("There is a problem with the method add");
			return;
		}
		list.add(30);
		if(list.last.data != 30)
		{
			System.out.println("There is a problem with the method add");
			return;
		}
		System.out.println("Good");
		
	}
	public static void testContains()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		if(!list.contains(10))
		{
			System.out.println("There is a problem with the method contains");
			return;
		}
		if(list.contains(1000))
		{
			System.out.println("There is a problem with the method contains");
			return;
		}
		System.out.println("Good");
	}
	public static void testGet()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		if(!(list.get(0) == 10 && list.get(1) == 20 && list.get(2) == 30 && list.get(3) == 40))
			System.out.println("There is a problem with the method get");
		System.out.println("Good");
	}
	public static void testSize()
	{
		LinkedList<Integer> list = new LinkedList<>();
		if(list.size() != 0)
		{
			System.out.println("There is a problem with the method size");
			return;
		}
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		if(list.size() != 4)
		{
			System.out.println("There is a problem with the method size");
			return;
		}
		System.out.println("Good");
	}
	public static void testRemove()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.remove(0);
		if(list.get(0) != 20)
		{
			System.out.println("There is a problem with the method remove");
			return;
		}
		list.remove(1);
		if(list.get(1) != 40)
		{
			System.out.println("There is a problem with the method remove");
			return;
		}		list.remove(1);
		if(list.get(0) != 20)
		{
			System.out.println("There is a problem with the method remove");
			return;
		}		
		if(list.size() != 1)
		{
			System.out.println("There is a problem with the method remove");
			return;
		}		System.out.println("Good");
	}
	public static void testGetFirst()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		if(list.getFirst() != 10)
		{
			System.out.println("There is a problem with the method getFirst");
			return;
		}
		System.out.println("Good");
	}
	public static void testGetLast()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		if(list.getLast() != 40)
		{
			System.out.println("There is a problem with the method getLast");
			return;
		}
		System.out.println("Good");
	}
	public static void testInsert()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.insert(33,2);
		if(list.get(2) != 33 || list.size() != 5)
		{
			System.out.println("There is a problem with the method insert");
			return;
		}
		System.out.println("Good");
	}
	public static void testSet()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.set(33,2);
		if(list.get(2) != 33 || list.size() != 4)
		{
			System.out.println("There is a problem with the method set");
			return;
		}
		System.out.println("Good");
	}
	public static void testClear()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.clear();
		if(list.size() != 0 || list.head != null)
		{
			System.out.println("There is a problem with the method clear");
			return;
		}
		System.out.println("Good");
	}
	public static void testRemoveLast()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.removeLast();
		if(list.size() != 3 || list.getLast() != 30)
		{
			System.out.println("There is a problem with the method removeLast");
			return;
		}
		System.out.println("Good");
	}
	public static void testRemoveFirst()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.removeFirst();
		if(list.size() != 3 || list.getFirst() != 20)
		{
			System.out.println("There is a problem with the method removeFirst");
			return;
		}
		System.out.println("Good");
	}
}