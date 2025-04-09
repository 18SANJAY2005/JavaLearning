package Array2d;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int s=sc.nextInt();
		int[] arr=new int[s];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println(check(arr));
	}
	public static int check(int[] arr) {
		int count=0,count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=Integer.MIN_VALUE)
			{
				count=1;
				for(int j=i+1;j<arr.length;j++)
			    {
				    if(arr[i]==arr[j])
				    {
				    	count++;
				    	arr[j]=Integer.MIN_VALUE;
				    }
				}
				if(count==1)
					count1++;
			}
		}
		return count1;
		
	}

}