package project3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrlistodde {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		ArrayList<Integer>prime=new ArrayList<>();

		System.out.println("Enter number");
		int nn=s.nextInt();
		System.out.println("Enter "+nn+" number");
		for(int i=0;i<nn;i++)
		{
		int n=s.nextInt();
		if(n%2==0||n==2)
		{
		even.add(n);
		}
		else
		{
		for(int j=2;j<=(n/2);j++) {
		if(n%j!=0){
		prime.add(n);
		}

		else {
		odd.add(n);
		}
		}
		}
		}
		for(int a:even)
		{
		System.out.println("Even numbers are:"+a);
		}
		for(int b:odd)
		{
		System.out.println("odd numbers are:"+b);
		}
		for(int c:prime)
		{
		System.out.println("prime numbers are:"+c);
		}

		}
		
	}


