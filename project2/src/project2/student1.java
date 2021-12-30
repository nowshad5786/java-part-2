package project2;
import java.util.Scanner;

public class student1 {
	  public static void main(String aa[])
	    {
	         Marks m=new Marks();
	         m.readDetails();
	         m.readMarks();
	         m.displayDetails();
	         m.displayMarks();
	} 
	  Scanner s=new Scanner(System.in);
	  int studentId;
	  String studentname,phone;
	   
	  void readDetails()
	  {
	      System.out.println("Enter id");
	      studentId=s.nextInt();
	      System.out.println("Enter name");
	      studentname=s.next();
	      System.out.println("Enter phone");
	      phone=s.next();
	  }
	   
	  void displayDetails()
	  {
	      System.out.println("ID :"+studentId);
	      System.out.println("Name:"+studentname);
	      System.out.println("Phoneno :"+phone);
	  }
	  }
	   
	  class Marks extends student1	 
	  {
	      int m1,m2,m3;
	   
	      void readMarks()
	      {
	          System.out.println("marks of Maths");
	          m1=s.nextInt();
	          System.out.println("marks of English");
	          m2=s.nextInt();
	          System.out.println("marks of Hindi");
	          m3=s.nextInt();
	      }

	      void displayMarks()
	      {
	          System.out.println("Marks ---\nMaths:"+m1);
	          System.out.println("English:"+m2);
	          System.out.println("hindi:"+m3);

	      }
}


