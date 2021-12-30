package project3;
import java.util.HashMap;
import java.util.Map;

public class map7 {
	public static void main(String args[])
	{
		HashMap<String, Teacher> map = new HashMap<>();
		Teacher s1=new Teacher(1,"saju", "seven");
		Teacher s2=new Teacher(2, "Ramu", "eight");
		Teacher s3=new Teacher(3, "anu", "eight");
		map.put("tech1", s1);
		map.put("tech2", s2);
		map.put("tech3", s3);
		for(Map.Entry<String,Teacher> n:map.entrySet()) {
			System.out.println(n.getKey()+" and "+n.getValue().id+" "+n.getValue().name+" "+n.getValue().classs);
	}

}
}

class Teacher
{
	int id;
	String name, classs;
	public Teacher(int id, String name, String classs) {
		super();
		this.id = id;
		this.name = name;
		this.classs = classs;
	}
}
