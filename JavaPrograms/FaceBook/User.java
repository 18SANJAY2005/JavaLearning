package FaceBook;

import java.util.Scanner;

public class User {
         String name;
         int id;
         String email;
         String password;
      
    User(){
      Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter the id");
   	   id = sc.nextInt();
   	  System.out.println("Enter the name");
   	  name = sc.next();
   	  System.out.println("Enter the email");
   	  email = sc.next();
   	  System.out.println("Enter the password");
   	  password = sc.next();
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
   	  
}
