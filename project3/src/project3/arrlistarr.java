package project3;
import java.util.ArrayList;

public class arrlistarr {
	public static void main(String arg[]) {
		ArrayList<String> li=new ArrayList<>();
		li.add("samu");
		li.add("anu");
		li.add("ramu");
		li.add("saju");
		ArrayList<ArrayList<String>> li2=new ArrayList<>();
		li2.add(li);
		System.out.println(li2);
		ArrayList<String>li3=new ArrayList<>();
		li3.add("bop");
		li3.add("bop");



		li3.add("bop");
		li3.add("bop");
		li2.add(li3);
		System.out.println(li2);

}

}
