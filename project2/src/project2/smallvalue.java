package project2;
import java.util.Scanner;

public class smallvalue {
	public static void main(String args[])
	{
		int num, i, small;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your array size");
		num = a.nextInt();
		int array[] = new int[num];
		System.out.println("Enter"+" " +num+ " " +"Numbers:");
		for(i=0; i<num;i++)
			array[i] = a.nextInt();
		small = array[0];
		for(i=1;i<num;i++)
		{
			if(small>array[i])
				small = array[i];
		}
		System.out.println("Smallest Number is:"+small);
	}
}
