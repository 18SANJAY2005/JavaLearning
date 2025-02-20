package assignment;
import java .util.Scanner;
public class Subjects {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Physics mark : ");
	int physics= sc.nextInt();
	System.out.println("Enter your Chemistry mark : ");
	int chemistry= sc.nextInt();
	System.out.println("Enter your Biology mark : ");
	int biology= sc.nextInt();
	System.out.println("Enter your Mathematics mark : ");
	int mathematics= sc.nextInt();
	System.out.println("Enter your ComputerScience mark : ");
	int computerScience= sc.nextInt();
	int totalMarks =physics+chemistry+biology+mathematics+computerScience ;
	System.out.println("Your Total Marks is : "+totalMarks);
	int  percentage=totalMarks/5;
	System.out.println("Your Average is : "+percentage);
	System.out.println("Your grade is : " +Grades(percentage));
	sc.close();

}
public static  String   Grades( int percentage ) 
{
		if (percentage>=90)
	
			 return  "Your grade is A";
		else if (percentage>=80)
			
			return  "Your grade is B";
		
		else if (percentage>=70)
				return "Your grade is C";
		
		else if (percentage>=60)
			return "Your grade is D";
		
		else if (percentage>=40)
			return "Your Grade is E";
		
		else 
			return "Your grade is  F";
		

		
}
	
}