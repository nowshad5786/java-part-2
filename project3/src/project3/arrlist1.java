package project3;
import java.util.ArrayList;

public class arrlist1 {
	public static void main(String args[])
	{
		ArrayList<Skill> list = new ArrayList<>();
		Skill a = new Skill("Python", 9);
		Skill a1 = new Skill("Java", 7);
		Skill a2 = new Skill("mysql", 8);
		list.add(a);
		list.add(a1);
		list.add(a2);
		for(Skill b:list) {
			System.out.println(b.langu+" "+b.mark);
		}
		
	}

}

class Skill
{
	String langu;
	int mark;
	public Skill(String langu, int mark) {
		super();
		this.langu = langu;
		this.mark = mark;
	}
}
