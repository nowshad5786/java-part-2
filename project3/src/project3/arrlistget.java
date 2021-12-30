package project3;
import java.util.ArrayList;
public class arrlistget {
	public static void main(String args[])
	{
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	
	System.out.println("My List:"+list);
	
	int element = list.get(2);
	System.out.println("The Elemnt at index 2 is:"+element);
	
	int repl = list.set(4, 70);
	System.out.println("After Replace List is:"+list);
	System.out.println("Replace element is:"+repl);
	
	list.clear();
	System.out.println(list);
	
	boolean ans = list.isEmpty();
    if (ans == true)
        System.out.println("The ArrayList is empty");
    else
        System.out.println("The ArrayList is not empty");
}
}
