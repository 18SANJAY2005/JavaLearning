package assignment;
import java.util.Scanner;
public class Angle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first angle");
	int  firstDegree= sc.nextInt();
	System.out.println("Enter your second angle");
	int  secondDegree= sc.nextInt();
	System.out.println("Enter your third angle");
	int  thirdDegree= sc.nextInt();
	System.out.println("Enter your third angle");
	int  totalAngle=firstDegree+secondDegree+thirdDegree;
    System.out.println(Validation(totalAngle));
    sc.close();

}
public static String Validation(int totalAngle) {
	if (totalAngle<180){
		 return "The triangle is not valid";
	}
	else {
		return "The triangle is valid";
	}
}
}