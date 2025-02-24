package looping;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Num = sc.nextInt();
		sc.close();
           
		int mul =1;
		for (int i = Num; i >= 1; i--)
			
				mul*=i;
		System.out.println(mul);
		}
      
	}


