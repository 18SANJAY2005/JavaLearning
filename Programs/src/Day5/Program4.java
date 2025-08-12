package Day5;

import java.util.Arrays;

public class Program4 {
          public static void main(String[] args) {
			String[] banned = {"bad","hate","ugly"};
			String s1="i am a bad boy";
			
			s1=s1.toLowerCase();
			for(String s:banned) {
				if(s1.contains(s)) {
					System.out.println(true);
					return;
				}
			}
			System.out.println(false);
		}
         
}         

