package project3;
import java.util.ArrayList;

public class arraylist {
	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<>();
		Student s1 = new Student("ram", "comp");
		Student s2 = new Student("saju", "pending");
		Student s3 = new Student("raju", "comp");
		Student s4 = new Student("anu", "pending");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		for(Student s:list) {
			System.out.println(s.name+" "+s.status);
		}
		
	}
	}
	class Student
	{
		String name;
		String status;
		public Student(String name, String status) {
			super();
			this.name = name;
			this.status = status;
		}
	}

