package ArraysListProblems;

import java.util.ArrayList;
import java.util.Collections;

public class sum_and_sort  {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(12);
		arr.add(34);
		arr.add(23);
		arr.add(56);
		arr.add(18);
		
		Collections.sort(arr,new com());
		System.out.println(arr);
		
	}

}
