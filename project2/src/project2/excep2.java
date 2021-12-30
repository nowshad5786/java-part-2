package project2;

public class excep2 {
	public static void main(String args[])
	{
		String name =null;
		int num1=15,num2=0;
		int res=0;
		int array[]={20,10,30};
	
	try {
		System.out.println(name.charAt(3));
		res = num1/num2;
		System.out.println(res);
		System.out.println(array[5]);
	}
	catch(NullPointerException e)
	{
		System.out.println("Exception null"+e);
	}
	catch(ArithmeticException e) {
		System.out.println("Can't be divided by Zero");
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Error?. Array is out of Bounds");
	}

}
}
