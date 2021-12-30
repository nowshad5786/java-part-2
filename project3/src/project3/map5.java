package project3;
import java.util.HashMap;
import java.util.Map;

public class map5 {
	public static void main(String args[])
	{
		HashMap<String, Bookk> map = new HashMap<>();
		Bookk s1=new Bookk(1,"saju", 1234);
		Bookk s2=new Bookk(2, "Ramu", 34534);
		Bookk s3=new Bookk(3, "anu", 9834);
		map.put("Book1", s1);
		map.put("Book2", s2);
		map.put("Book3", s3);
		for(Map.Entry<String,Bookk> n:map.entrySet()) {
			System.out.println(n.getKey()+" and "+ n.getValue().id+" "+n.getValue().name+" "+n.getValue().price);
		}
	}
}
class Bookk
{
	int id, price;
	String name;
	public Bookk(int id, String name, int price) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
}
