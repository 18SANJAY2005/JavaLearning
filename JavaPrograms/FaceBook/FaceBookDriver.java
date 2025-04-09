package FaceBook;

import java.util.Scanner;

import utils.Logger;

public class FaceBookDriver {
	
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   while(true) {
    		   System.out.println("AddUser");
    		   System.out.println("Exit");
    		   Logger log = new Logger();
    		   int option = sc.nextInt();
    		   switch(option) {
    		   case 1:
    			   User u1 = new User();
    			   System.out.println(u1);
    			   log.write(u1.toString());
    			   break;
    		   case 2:
    			   System.out.println("You have exit");
    			   System.exit(0);
    			   
    		   }
		
	}
}
}