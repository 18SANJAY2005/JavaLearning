package assignment;
import java.util.Scanner;
public class Efficiency {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the hours worked: ");
	int hoursWorked= sc.nextInt();
	System.out.println(efficiency(hoursWorked));
	sc.close();

}
public static String efficiency(int hoursWorked) {
	if(( hoursWorked<3)&&(hoursWorked>=2)) {
		return "You are efficient";
	}
	else if (( hoursWorked<4)&&(hoursWorked>=3)) {
		return "You must imporve your work speed";
		
	}
	else if (( hoursWorked<5)&&(hoursWorked>=4)) {
		return "YOu must undergo Training to improve your work speed";
	}
	else  {
		return "You must leave the company";
		
	}
}
	
}