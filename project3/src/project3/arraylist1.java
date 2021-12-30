package project3;
import java.util.ArrayList;

public class arraylist1 {
	public static void main(String args[]) {
		ArrayList<String> num=new ArrayList<>();
		System.out.println("Array");
		num.add("C");
		num.add("C++");
		num.add("Python");
		num.add("php");
		for(String n:num)
		{
		System.out.println(n);
		}
		num.remove(3); //remove method
		System.out.println("The altered array is");
		System.out.println(num);
	}

}
