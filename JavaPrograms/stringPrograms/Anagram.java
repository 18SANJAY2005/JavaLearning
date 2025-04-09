package stringPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bca";
		System.err.println(check(s1,s2));

}
	public static boolean check(String s1,String s2) {
		if(s1.equals(s2))
			return true;
		if(s1.length()!=s2.length())
			
		return false;
		int[]arr1=new int[26];
		int[]arr2=new int[26];
		for(int i=0;i<s1.length();i++) {
			arr1[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			arr2[s2.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		return Arrays.equals(arr1, arr2);
	}
}