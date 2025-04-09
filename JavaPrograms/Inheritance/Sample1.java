package Inheritance;

public class Sample1 extends Sample2 {
         String name = "qwertyuo";
         
         void display() {
        	 System.out.println(super.name);
        	 //System.out.println(this.name);
         }
         
         
         public static void main(String[] args) {
			Sample1 s1 = new Sample1();
			System.out.println(s1.name);
			s1.display();
		}
         
}
