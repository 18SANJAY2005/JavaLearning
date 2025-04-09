package WrapperClass;

public class Demo {
	public static void main(String[] args) {
		
	      Integer a=10;
	      Integer c=10; 
//          int a =20;
          Integer b = Integer.valueOf(a);
          System.out.println(b);
          System.out.println(a==c);
          System.out.println(a.equals(c));
          System.out.println(a.hashCode());
}
}
