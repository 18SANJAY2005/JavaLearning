package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int a:arr)
		{
			list.add(a);
			
		}
		int i=0;
		while(i<list.size()-1)
		{
			if(list.get(i)==0)
			{
				list.add(i+1,0);
				i++;
			}
			i++;
		}
		for(int j=0;j<arr.length;j++)
		arr[j]=list.get(j);
		System.out.println(Arrays.toString(arr));
	}
	

}
