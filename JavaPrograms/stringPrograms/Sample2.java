package stringPrograms;

public class Sample2 {
	public static void main(String[] args) {
             String s1="abcdefghijklmnopqrstuvwxyz";
             int[] arr = new int[26];
             int i=0;
             while(i<s1.length()) {
            	 arr[s1.charAt(i)-'a']++;
            	 i++;
             }
             for(int a:arr) {
            	 if(a==0) {
            		 System.out.println("Not Panagram");
            	 }
             }
             
            		 System.out.println("Panagram");
            	 }
             }
	

