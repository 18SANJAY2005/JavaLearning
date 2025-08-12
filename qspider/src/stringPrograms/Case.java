package stringPrograms;

import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 =sc.next();
		char[] ch =s1.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<97) {
				ch[i]+=32;
			}else 
				ch[i]-=32;
			res+=ch[i];
		}
			System.out.println(res);
		}
		
	
	}


