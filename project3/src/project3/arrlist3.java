package project3;
import java.util.ArrayList;

public class arrlist3 {
	public static void main(String args[])
	{
		ArrayList<Exam>list= new ArrayList<>();
		Exam m1 = new Exam("ram",432,500);
		Exam m2 = new Exam("sam",423,500);
		Exam m3 = new Exam("raj",442,500);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		for(Exam e:list) {
			System.out.println(e.Sname+" "+e.mark+" "+e.tmark);
		}
	}

}

class Exam{
	String Sname;
	int mark,tmark;
	public Exam(String sname, int mark, int tmark) {
		super();
		Sname = sname;
		this.mark = mark;
		this.tmark = tmark;
	}
}
