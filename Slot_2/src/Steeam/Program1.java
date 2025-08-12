package Steeam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program1 {
           public static void main(String[] args) {
			List<Integer> list = Arrays.asList(10,15,30,25,50,50,10,30);
			
			Stream<Integer> s = list.stream();
			Stream<Integer> s1 = list.stream();
//			List res =list.stream().map((a) -> a+2).toList();
	        List<Integer> res = s.map((a) -> a+2).toList();
	        List<Integer> res1 = s1.filter((a) -> a%2==1).toList();
	        List<Integer> res2 = list.stream().filter((a)-> a%2 ==0).map((a)->a*2).map((a)-> a/4).toList();	
	        System.out.println("----------SORT--------------");
	        list.stream().sorted().forEach(System.out::println);
	        System.out.println("----------SORT--------------");
	        list.stream().sorted((a,b) -> b-a).forEach(System.out::println);
            Object[] arr =list.stream().distinct().toArray();
            System.out.println("--------LIMIT----------------");
            list.stream().limit(3).forEach(System.out::println);
	        System.out.println("MAP = " + res);
	        System.out.println("Filter =" + res1);
	        System.out.println("Filter =" + res2);
	        System.out.println("Distinct =" + Arrays.toString(arr));
			
		}
}
