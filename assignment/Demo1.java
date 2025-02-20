package assignment;

import java.util.Scanner;

public class Demo1  {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter first number");
	int a=sc.nextInt();
 System.out.println("enter  second number ");
 int  b =sc.nextInt();
 System.out.println("1.Addition  2.Subtraction 3.Multiplication 4 .Division");
 System.out.println("enter operation");
 int  option=sc.nextInt();
 sc.close();		 
		 
 switch(option) {
	case (1):
	System.out.println(Demo2.add(a, b));
	break;

case (2):
 System.out.println(Demo2.sub(a, b));
break;

case (3):
System.out.println(Demo2.multiplication(a, b));
 break;

case (4):
System.out.println(Demo2.modulus(a,b));
}
}
}