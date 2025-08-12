package Assignment4;
import java.util.*;
public class ReverseLettersInSentance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.nextLine());
	}
	public static void calculate(String s) {
		char ch[]=s.toCharArray();
		int space=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				space++;
			}
		}
		String s1[]=new String[space+1];
		int z=0;
		int indicate=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				s1[z++]=s.substring(indicate,i);
				indicate=i+1;
			}
		}
		s1[z]=s.substring(indicate);
		for(int i=0;i<s1.length;i++) {
			s1[i]=reverse(s1[i]);
		}
		String res="";
		for(int i=0;i<s1.length;i++) {
			res+=s1[i]+" ";
		}
		System.out.println(res);
	}
	public static String reverse(String s) {
		char ch[]=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		return new String(ch);
	}
}
