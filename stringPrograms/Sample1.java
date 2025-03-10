package stringPrograms;

public class Sample1 {
	public static void main(String[] args) {
    String[]arr= {"mam","sas","madam","sus","malayalam"};
    String a ="";
    check(arr,a);
	}
	public static void check(String [] arr,String a) {
		 for(int i=0;i<arr.length;i++) {
			  if(arr[i].length()>a.length()) {
				  a=arr[i];
			  }
		 }
		 System.out.println(a);
	}
}
