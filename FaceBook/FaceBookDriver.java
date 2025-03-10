package FaceBook;

import java.util.Scanner;

public class FaceBookDriver {
	
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   while(true) {
    		   System.out.println("AddUser");
    		   System.out.println("Exit");
    		   int option = sc.nextInt();
    		   switch(option) {
    		   case 1:
    			   FaceUtility.createUser();
    			   break;
    		   case 2:
    			   System.out.println("You have exit");
    			   System.exit(0);
    			   
    		   }
		
	}
}
}