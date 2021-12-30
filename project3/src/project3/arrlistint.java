package project3;
import java.util.ArrayList;

public class arrlistint {
	public static void main(String arg[])
	{
		ArrayList<Integer>list = new ArrayList<>();
		list.add(123);
		list.add(3456);
		list.add(875);
		list.add(5678);
		for(int x: list)
		{
			System.out.println(x);
		}
	}
}
