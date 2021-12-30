package project2;

public class tringle {
	int a,b,c;
	public double getArea() {
		double s = (a+b+c)/2.0;
		return Math.pow((s*(s-a)*s-b)*(s-c)),.5);
	}
	public double getPerimeter() {
		return (a+b+c)/2.0;
	}

}
class area{
	public static void main(String[] args) {
		tringle t =new tringle();
		t.a = 3;
		t.b =4;
		t.c = 5;
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}
}
