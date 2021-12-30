package project2;

 class car {
	 String brandname, price;
	 car(String x, String y){
		 brandname = x;
		 price = y;
	 }
	 String getDetails() {
		 return brandname+" "+price;
	 }
	public static void Main(String arg[])
	{
		car c=new car("tata", "23456");
				System.out.print(c.getDetails());
	}
}
