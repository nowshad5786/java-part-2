package project3;
import java.util.ArrayList;

public class arrliststr {
	public static void main(String args[])
	{
		ArrayList<String>list = new ArrayList<>();
		list.add("Python");
		list.add("Java");
		list.add("HTML");
		for(String x:list)
		{
			System.out.println(x);
		}
	}

}
