package FaceBook;

import java.util.Scanner;

public class FaceUtility {
       public static void createUser() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the id");
    	  int id = sc.nextInt();
    	  System.out.println("Enter the name");
    	  String name = sc.next();
    	  System.out.println("Enter the email");
    	  String email = sc.next();
    	  System.out.println("Enter the password");
    	  String password = sc.next();
    	  
    	  System.out.println("----USER DETAILS----");
    	  User user = new User(name,id,email,password);
    	  System.out.println("User Name :" + user.name );
    	  System.out.println("User id :" + user.id );
    	  System.out.println("User email :" + user.email );
    	  System.out.println("User password :" + user.password );
    	  
       }
}
