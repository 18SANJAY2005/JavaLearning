package NetflixProject;
import utils.*;
import java.util.Scanner;

public class NetflixDriver {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  Logger log = new Logger();
	  while(true) {
	    System.out.println("1.AddUser");
	    System.out.println("2.AddMovie");
	    System.out.println("3.Stop");
	    System.out.println("Select option");
	    int option = sc.nextInt();
	    switch(option) {
	    case 1:
	    	User u1  = new User();
	    	System.out.println(u1);
	    	log.write(u1.toString());
	    	break;
	    case 2:
	    	Movie m1 = new Movie();
	    	System.out.println(m1);
	    	log.write(m1.toString());
	    	break;
	    case 3:
	    	System.exit(0);
	   
	    }
}
}
}
