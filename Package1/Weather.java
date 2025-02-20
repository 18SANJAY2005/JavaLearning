package Package1;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the Month");
		String month = i.nextLine();
		System.out.println(month);
		i.close();
		//Check(month);
		
		switch(month) {
		case "December","February","January":
			System.out.println("Winter");
		    break;
		case "March","April","May":
			System.out.println("Spring");
		    break;
		case "June","July","August":
			System.out.println("Summer");
		    break;
		case "september","October","November":
			System.out.println("Autumn");
		    break;
		}
	
	}
	//public static String Check(String a) {
		//if (a.equals("january") || a.equals("February")|| a.equals("December")) {
			//return "Winter";
		//}else if (a.equals("March") || a.equals("April") || a.equals("May")) {
		//	return "Spring";
		//}else if(a.equals("June") || a.equals("July") || a.equals("August")) {
			//return "Summer";
		//}else {
			//return "Autumn";
		
		
	}
	
	
	





