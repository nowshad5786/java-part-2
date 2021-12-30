package project2;

public class interone {
	public static void main(String args[])
	{
		MyClass b = new MyClass();
		b.method1();
		b.method2();
		
	}
}
	interface A
	{
		void method1();
		void method2();
	}
	class MyClass implements A
	{
		public void method1()
		{
			System.out.println("method1");
		}
		public void method2()
		{
			System.out.println("method2");
		}
	}
	


