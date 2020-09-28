import java.util.ArrayList;

public class ArrayListTest {

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
	
	public static void main(String[] args)
	{
		System.out.println("ArrayList test program");

		System.out.println("Example 1");
		example1();
		System.out.println();
	}
}
