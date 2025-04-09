package assignment;
import java.util.Scanner;
public class Area {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your length : ");
	int length= sc.nextInt();
	System.out.println("Enter your breadth");
	int breadth=sc.nextInt();
	int area =length*breadth;
	int perimeter=2*(length+breadth);
	System.out.println(Result(  area , perimeter));
	sc.close();
}
public static String Result( int area ,  int perimeter) {
	if (area>perimeter) {
		return "The area is greater than perimeter";
	}
	else {
			return "The perimeter is greater than area";
		}
	}
}