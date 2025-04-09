package NonStatic;
import utils.*;

public class stringBuffer {
	public static void main(String[] args) {
//		 Logger l1 = new Logger();
         StringBuffer s1 = new StringBuffer("abc");
         StringBuffer s2 = new StringBuffer("abc");
//         String s3 = "hello";
//         s3=s3.toUpperCase();
//         System.out.println(s3);
//         System.out.println(new String(s1).equals(new String(s2)));
//         System.out.println(s2.capacity());
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.capacity());
//         s1.append("asd");
//        s1.append("abc");
//         System.out.println(s1.capacity());
        System.out.println(s1.capacity());
        s1.trimToSize();
        System.out.println(s1.reverse().toString());
//         System.out.println(s1.length());
//         l1.write(s1.toString());
//           s1.insert(3, "def");
         
         
         
	}
}
