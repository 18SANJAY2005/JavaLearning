package Day3;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Program1 {
          public static void main(String[] args) {
			int [] arr = {1,2,3};
        	  int a = Arrays.stream(arr).sum();
        	  OptionalDouble res = Arrays.stream(arr).average();
        	  System.out.println(a);
        	  System.out.println(res);
		}
}
