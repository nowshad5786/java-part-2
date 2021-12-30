package project3;
import java.util.ArrayList;
import java.util.Scanner;


public class arralist1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name, nickname, phone;
		ArrayList<names> list=new ArrayList<>();
		System.out.println("Enter the list of friends");
		int b=s.nextInt();
		for(int i=0;i<b;i++) {
		System.out.println("Enter name,nickname,contactNo");
		name=s.next();
		nickname=s.next();
		phone=s.next();
		names x=new names(name,nickname,phone);
		list.add(x);
		}
		System.out.println("Name\t Nickname\t Phone");
		for(names x:list)
		{
		System.out.println(x.name+ "\t "+x.nickname+ "\t "+x.phone);
		}
		}
		}



		class names{
		String name,nickname,phone;
		public names(String name, String nickname, String phone) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.phone = phone;
		}
		
	}


