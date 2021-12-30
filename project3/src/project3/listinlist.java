package project3;
import java.util.ArrayList;
public class listinlist {
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> inner = new ArrayList<Integer>();
		ArrayList<Integer> inner1 = new ArrayList<Integer>();
		inner.add(100);
		inner.add(200);
		inner1.add(300);
		inner1.add(400);
		outer.add(inner);
		outer.add(inner1);
		System.out.println(outer);
	}

}
