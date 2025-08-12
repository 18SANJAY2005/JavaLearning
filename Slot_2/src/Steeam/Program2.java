package Steeam;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 30, 25, 50, 50, 10, 35);
		int a1 = list.stream().min((a,b)->(a-b)).get();
		int a2 = list.stream().max((a,b)->(a-b)).get();
		long l = list.stream().filter((a)-> a%2==0).count();
		int a3 = list.stream().reduce(0, (a,b)-> (a+b));
		System.out.println("MIN VALUE = " + a1);
		System.out.println("MAX VALUE = " + a2);
		System.out.println("COUNT = " + l);
		System.out.println("REDUCE = " + a3);
		
	}
}
