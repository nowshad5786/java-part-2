package project3;
import java.util.HashMap;
import java.util.Map;

public class map3 {
	public static void main(String args[])
	{
	HashMap<String, Integer> map = new HashMap<>();
	map.put("java", 79);
	map.put("php", 60);
	map.put("android", 90);
	
	for(Map.Entry<String, Integer> l:map.entrySet())
	{
		System.out.println(l.getKey()+" is "+l.getValue());
	}

}
}
