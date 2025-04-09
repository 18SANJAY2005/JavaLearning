package ArraysListPrograms;

import java.util.ArrayList;

public class ProductDriver {
       public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product("mouse",101,150.00));
		al.add(new Product("Keyboard",102,250.00));
		al.add(new Product("monitor",103,300.00));
//		int id=101;
		String name ="mouse";
		Product m1 = null;
		for(Product p:al) {
			if(name==p.name) {
				m1=p;
				break;
			}
		}
		if(al.remove(m1)) {
			System.out.println("Removed");
		}else {
			System.out.println("Not Removed");
		}
//		for(int i=0;i<al.size();i++) {
//			if(id==al.get(i).id) {
//				al.remove(al.get(i));
//			}
//		}
//		System.out.println(al);
//		Product a = new Product("monitor",103,300.00);
//		al.remove(a);
//		System.out.println(al);
//		if(al.remove(a)) {
//			System.out.println("element is removed");
//			System.out.println(al);
//		}else {
//			System.out.println("element is not removed");
//		}
		
	}
}
