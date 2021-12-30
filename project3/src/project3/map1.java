package project3;
import java.util.HashMap;
import java.util.Map;

public class map1 {
	public static void main(String args[])
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "saju");
		map.put("key2", "anu");
		map.put("key3", "ramu");
		for(Map.Entry<String, String> me:map.entrySet())
		{
			System.out.println(me.getKey()+" and "+me.getValue());
		}
		
	}

}
