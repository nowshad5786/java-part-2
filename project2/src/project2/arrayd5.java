package project2;
import java.util.Scanner;

public class arrayd5 {
	 public static void main(String aa[])
	    {
	        int sum=0;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter size of array");
	        int size=s.nextInt();

	    int numbers[]= new int[size];
	    System.out.println("Enter the elements of array : ");
	    for(int i=0;i<size;i++)
	    {
	    numbers[i]=s.nextInt();
	    }      

	    System.out.println("Printing all the entered elements of array");
	    for(int i=0;i<numbers.length;i++)
	    {

	    sum=sum+numbers[i];
	    }
	    System.out.println(sum);
	    }

}
