package poly;
//variable shadowing or hiding
public class Demo {
	// static int a;   static variable
        int a;
       void display() {
    	   int a=20;
    	   System.out.println(a);
       }
       public static void main(String[] args) {
		//int a=20;     static variable
		//System.out.println(a);
    	   new Demo().display();
	}
}
