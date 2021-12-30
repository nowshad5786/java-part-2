package project3;
import java.util.ArrayList;
import java.util.Collections;

public class arrlistodd {
	public static void main(String[] args) {
		int[] myArray={1,3,4,2,12,10,8,7,6,5,9,14} ;
		ArrayList<Integer>evenList = new ArrayList<Integer>();
		ArrayList<Integer>oddList = new ArrayList<Integer>();
		ArrayList<Integer>primeList = new ArrayList<Integer>();
		
		for(int i=0;i<myArray.length;i++){
		if(myArray[i]%2==0){
		evenList.add(myArray[i]);
		}else{
		oddList.add(myArray[i]);
		}
		
		boolean flag = false;
		for(int j = 2; j<=myArray.length; j++) {
			if (myArray[i]%j ==0) {
				flag = true;
				break;
		}
			if(!flag)
				primeList.add(myArray[i]);
		}
		}
		
		Collections.sort(evenList);
		Collections.sort(oddList);
		Collections.sort(primeList);
		System.out.println(evenList+",");
		System.out.println(oddList+",");
		System.out.println(primeList+",");
		}

}

