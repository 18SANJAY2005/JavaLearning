package MethodRefrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
   public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,20,55,40,23);
	List<Integer> result = new ArrayList<>();
	
	for(int a : list) {
		if(a%2==0)
			result.add(a);
	}
	System.out.println(result);
}
}
