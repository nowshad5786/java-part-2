package project3;

public class inhari {
	public static void main(String args[])
	{
		B r=new B();
		C r2= new C();
		r.input(); r.show();
		r2.input(); r2.show1();
	}

}
class A
{
	void input()
	{
		System.out.println("Enter your name:");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("My name is sjau");
	}
}
class C extends A
{
	void show1()
	{
		System.out.println("My name is ramu");
	}
}
