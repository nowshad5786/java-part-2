package project2;
import java.util.Scanner;

public class largenum {
	public static void main(String arg[]) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sizw of teh array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("ehter the elements");
		for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<size;i++) {
		if(arr[i]>max) {
		max=arr[i];
		}
		}
		System.out.println("largest no is:"+max);
		}

}
