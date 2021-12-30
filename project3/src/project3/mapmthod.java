package project3;
import java.util.HashMap;
import java.util.Map;

public class mapmthod {
	public static void main(String args[])
	{
		HashMap<String,String> exp=new HashMap<>();
		exp.put("color1", "Red");
		exp.put("color2", "Blue");
		exp.put("color3", "White");
		System.out.println(exp);
		System.out.println("Is the key color2 present?"+exp.containsKey("color2")); //containsKey

		System.out.println("get method:"+exp.get("color1") ); //get

		exp.replace("color3", "indigo"); //replace
		System.out.println(exp);

		System.out.println("Size of exp:"+exp.size()); //size



		HashMap<String,String> exp1=new HashMap<>();
		exp1.put("color4", "pink");
		exp1.put("color5", "green");
		exp1.put("color6", "yellow");
		System.out.println(exp1);


		exp1.remove("color5"); //remove
		System.out.println("The set after removing color5:"+exp1);

		System.out.println("Equality:"+exp.equals(exp1)); //equals


		exp1.putAll(exp);
		System.out.println(exp1); //putAll


		System.out.println("The set is:"+exp.keySet()); //keySet


		exp.clear(); //clear
		System.out.println(exp);

		boolean res=exp.isEmpty(); //isempty
		if(res==true) {
		System.out.println("Its empty");
		}
		else {
		System.out.println("Its not empty");
		}


		}
	}


