package TreeSetPrograms;

import java.util.TreeSet;

public class ProductDriver {
           public static void main(String[] args) {
			TreeSet<Product> s = new TreeSet<Product>(new idComparator());
			s.add(new Product("AAA", 200.00, 101));
			s.add(new Product("BBB",300.00,103));
			s.add(new Product("CCC",400.00,102));
			
			System.out.println(s);
		}
}
