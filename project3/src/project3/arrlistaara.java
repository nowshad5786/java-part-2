package project3;
import java.util.ArrayList;

public class arrlistaara {
	public static void main(String args[])
	{
		ArrayList<String>list = new ArrayList<>();
		list.add("p");
		list.add("q");
		list.add("r");
		list.add("s");
		list.add("t");
		
		System.out.println(list);
		
		ArrayList<String>list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		System.out.println(list1);
		
		System.out.println(list1.addAll(list));
		System.out.println(list1);
	}
}
