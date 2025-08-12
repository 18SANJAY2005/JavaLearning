package Assignments;

public class CovertToNumber {
	public static void main(String[] args) {
           int a = 2048;
           System.out.println(a);5
           String[] arr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
           String b =String.valueOf(a);
           StringBuilder res = new StringBuilder();
           for(int i=0;i<b.length();i++) {
        	   res.append(arr[b.charAt(i)-48]);
        	   if(i!=b.length()-1)
        		   res.append(" ");
           }
          System.out.println(res.toString());
           
           
	}
	
}
