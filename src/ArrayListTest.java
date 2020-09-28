import java.util.ArrayList;

public class ArrayListTest
{
	private static void example1()
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Jack");
		list.add("James");
		list.add("Enola");
		
		System.out.println("Number of elements: " + list.size());
		
		for (String item : list)
		{
			System.out.println(item);
		}
	}
	
	private static void example2()
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		if (list.size() == 0)
		{
			System.out.println("The list is empty.");
		}
		
		if (list.isEmpty())
		{
			System.out.println("The list is empty.");
		}
	}
	
	private static void example3()
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		
		if (list.size() != 0)
		{
			System.out.println("The list is not empty.");
		}
		
		if (!list.isEmpty())
		{
			System.out.println("The list is not empty.");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("ArrayList test program");

		System.out.println("Example 1");
		example1();
		System.out.println();
		
		System.out.println("Example 2");
		example2();
		System.out.println();
		
		System.out.println("Example 3");
		example3();
		System.out.println();
	}
}
