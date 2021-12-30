package project2;
import java.util.Scanner;

public class arrayd4 {
	public static void main(String aa[])
    {
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
        System.out.println(numbers[i]);
    }

    }

}
