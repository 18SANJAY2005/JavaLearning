package CollectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = sc.nextInt();
		for(int i=1;i<size;i++)
		{
			list.add(sc.nextInt());	
		}
		System.out.println(list);	
		for(int i=0 ;i<list.size();i++)
		{
			int count=1;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					count++;
					list.set(j,null);
				}				
			}
			if(count==1)
				list.set(i, null);
		}
		
		int i=0;
		while(i<list.size())
		{
			if(list.get(i)==null)
				list.remove(i);
			else
				i++;	
		}
		System.out.println(list);
	}
}
//[4, 2, 7, 1, 2, 3, 4, 8, 1, 3]
