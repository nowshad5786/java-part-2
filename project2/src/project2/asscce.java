package project2;
import java.util.Scanner;

public class asscce {
	public static void main(String[] args)
	   {
	      char ch;
	      int ascii;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter a Character: ");
	      ch = scan.next().charAt(0);
	      
	      ascii = ch;
	      System.out.println("\nASCII Value = " +ascii);
	   }
	

}
