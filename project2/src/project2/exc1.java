package project2;

public class exc1 {
	public static void main(String args[])
	{
		for(int i=1; i<=10; i++) {
			try {
				if(i==5) {
					i= i/0;
				}
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println("Exception in code:"+e);
			}
		}
	}

}
