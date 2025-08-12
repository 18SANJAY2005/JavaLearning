package Assignment4;
import java.util.*;
public class RemoveSpaceFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculate(sc.nextLine());
	}
	public static void calculate(String s) {
		char ch[]=s.toCharArray();
		int space=0;
		for(int i=0;i<ch.length;i++) {
			if((int)ch[i]==32) {
				space++;
			}
		}
		char res[]=new char[ch.length-space];
		int z=0;
		for(int i=0;i<ch.length;i++) {
			if((int)ch[i]!=32) {
				res[z++]=ch[i];
			}
		}
		System.out.println(new String(res));
	}
}
