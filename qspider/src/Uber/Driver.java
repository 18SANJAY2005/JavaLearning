package Uber;

import java.util.*;

import utils.Logger;


public class Driver {
         public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Mini");
			System.out.println("2. Sedan");
			System.out.println("3. Luxury");
			System.out.println("Enter The Option : ");
			Logger log = new Logger();
            int option = sc.nextInt();
            Cab c=null;
            switch(option) {
            case 1: c=new Mini();
            break;
            case 2: c=new Sedan();
            break;
            case 3: c=new Luxury();
            break;
            }
            if(c instanceof Mini) {
            System.out.println(((Mini)c).price);
            }else if( c instanceof Sedan) {
            	System.out.println(((Sedan)c).price);
            }else if (c instanceof Luxury) {
            	System.out.println(((Luxury)c).price);
            }
			
		}
}
