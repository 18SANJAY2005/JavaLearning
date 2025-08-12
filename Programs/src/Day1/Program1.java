package Day1;

public class Program1 {
       public static void main(String[] args) {
		  int [] arr = {1,4,3,2,6,4};
		  int count =0;
		  for(int i =0;i<arr.length-2;i++) {
			
				  if(arr[i]+arr[i+2] == arr[i+1]) {
					  count+=1;
				  }
			  
			  
		  }
		  System.out.println(count);
	}
}
