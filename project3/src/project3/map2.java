package project3;
import java.util.HashMap;
import java.util.Map;

public class map2 {
	public static void main(String args[])
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("color1", "red");
		map.put("color2", "black");
		map.put("color3", "pink");
		for(Map.Entry<String, String> a:map.entrySet())
		{
			System.out.println(a.getKey()+" is "+a.getValue());
		}
	}
}
