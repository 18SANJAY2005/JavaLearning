package poly;
import java.util.*;
public class Sample {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       String a = sc.next();
       check(a);
	}
	public static void check(String a) {
		int vov=0;
		int con=0;
	    String b ="";
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vov++;
				b+=ch;
			}else {
				con++;
			}
		}
		System.out.println(b+con);
	}
}

