package NetflixProject;

import java.util.Scanner;

public class User {
	String name;
	String mailId;
	String password;
	long mobileNumber;
	
	
	
	public User() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your Mailid");
		mailId = sc.next();
		System.out.println("Enter your password");
		password = sc.next();
		System.out.println("Enter your Number");
		mobileNumber = sc.nextLong();
		
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", mailId=" + mailId + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ "]";
	}

	

}
