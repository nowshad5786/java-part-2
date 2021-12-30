package project3;
import java.util.ArrayList;

public class arrlistbook {
	public static void main(String args[])
	{
		ArrayList<Book>list = new ArrayList<>();
		Book b = new Book(01,"abc","abcd",123);
		Book b1 = new Book(01,"xyz","wxyz",1233);
		
		list.add(b);
		list.add(b1);
		for(Book c:list) {
			System.out.println(c.id+" "+c.name+" "+c.aname+" "+c.price);
		}
	}

}
class Book
{
	int id, price;
	String name, aname;
	public Book(int id, String name, String aname, int price) {
		super();
		this.id = id;
		this.name = name;
		this.aname = aname;
		this.price = price;
	}
}
