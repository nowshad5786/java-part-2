package project3;
import java.util.HashMap;
import java.util.Map;

public class map4 {
	public static void main(String args[])
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "saju");
		map.put(2, "ramu");
		map.put(3, "anu");
		for(Map.Entry<Integer,String> n:map.entrySet())
		{
			System.out.println(n.getKey()+" is "+n.getValue());
		}
	}
}
