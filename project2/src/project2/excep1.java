package project2;

public class excep1 {
	public static void main(String args[]) {
		try {
			String var =null;
			System.out.println(var.charAt(3));
		}
		catch(Exception e) {
			System.out.println("Exception is:"+e);
		}
	}

}
