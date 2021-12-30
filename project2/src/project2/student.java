package project2;

public class student {
	String name, rollno;
	void setName(String name)
	{
		this.name = name;
	}
	void setRollno(String rollno)
	{
		this.rollno = rollno;
	}
	String getName()
	{
		return name;
	}
	String getRollno()
	{
		return rollno;
	}
	public static void main(String args[])
	{
		student t1=new student();
		t1.setName("Nowshad");
		t1.setRollno("20");
		System.out.print(t1.getName()+" "+t1.getRollno());
	}

}
