package Array;

public class Frequence {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,10,20};
		
	
		for(int i=0;i<arr.length;i++) {
		
			int count;
			if(arr[i]!=Integer.MIN_VALUE) {
				count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					arr[j]=Integer.MIN_VALUE;
					count++;
				}
			}
			System.out.println(arr[i]+ " : " + count);
		}
           
          
	}
}
}


