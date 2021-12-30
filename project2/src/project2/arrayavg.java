package project2;

public class arrayavg {
	public static void main(String args[]) {
		int array[]= {4,3,6,7};
		int sum = 0;
		double avg = 0;
		for(int i =0; i<array.length; i++) {
			sum = sum+array[i];
		}
		avg = sum/array.length;
		System.out.println(avg);
	}
}
