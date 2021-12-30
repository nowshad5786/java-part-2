package project2;
import java.util.Scanner;

public class bankaccount {
	String accno;
	String name;
	long balance;
	Scanner sc = new Scanner(System.in);
	public void openAccount()
	{
		System.out.println("Enter your Account no:");
		accno = sc.next();
		System.out.println("Enter your Name::");
		name = sc.next();
		System.out.print("Enter Balance: ");  
	    balance = sc.nextLong(); 
	}
	 public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	    }  
	 
	 public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
}
