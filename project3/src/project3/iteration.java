package project3;
import java.util.HashMap;
import java.util.Map;

public class iteration {
	public static void main(String arg[]) {
		HashMap<String,String> hash=new HashMap<>();
		hash.put("color1","Red");
		hash.put("color2","Black");
		hash.put("color3","Pink");
		hash.put("color4","Green");

		System.out.println(hash);
		hash.replace("color2", "yellow");
		System.out.println(hash);
		hash.remove("color3");
		System.out.println(hash);
		System.out.println(hash.get("color1"));




		hash.clear();
		System.out.println(hash.isEmpty());
		for(Map.Entry<String,String> m:hash.entrySet()) {
		System.out.println("the keys are:"+m.getKey()+"values are:"+m.getValue());
		}
		}

}
