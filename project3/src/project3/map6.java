package project3;
import java.util.HashMap;
import java.util.Map;

public class map6 {
	public static void main(String args[])
	{
		HashMap<String, Employee> map = new HashMap<>();
		Employee s1=new Employee(1,"saju", 1234);
		Employee s2=new Employee(2, "Ramu", 34534);
		Employee s3=new Employee(3, "anu", 9834);
		map.put("emp", s1);
		map.put("emp1", s2);
		map.put("emp2", s3);
		for(Map.Entry<String,Employee> n:map.entrySet()) {
			System.out.println(n.getKey()+" and "+n.getValue().id+" "+n.getValue().Name+" "+n.getValue().salary);
	}

}
}
class Employee
{
	int id, salary;
	String Name;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.salary = salary;
		Name = name;
	}
}
