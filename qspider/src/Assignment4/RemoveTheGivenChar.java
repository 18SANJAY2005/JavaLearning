package Assignment4;
import java.util.*;
public class RemoveTheGivenChar {
	public static void main(String[] args) {
		String s="hello";
		Scanner sc=new Scanner(System.in);
		calculate(sc.next().charAt(0),s);
	}
	public static void calculate(char ch,String s1) {
		int count=0;
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(ch==c[i]) {
				c[i]=Character.MIN_VALUE;
				count++;
			}
		}
		if(count==0) {
			System.out.println("No Character found");
			return;
		}
			
		char ch1[]=new char[c.length-count];
		int z=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!=Character.MIN_VALUE)
				ch1[z++]=c[i];
				
		}
		System.out.println(new String(ch1));
	}
}
