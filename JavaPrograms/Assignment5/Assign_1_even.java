package Assignment5;
import java.util.ArrayList;
import java.util.Iterator;
public class Assign_1_even {
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=2;i<9;i++) {
			int b=5*i;
			a.add(b);
		}
		System.out.println(a.toString());
		Iterator i=a.iterator();
		while(i.hasNext()) {
			Integer num=(Integer) i.next();
			if(num%2==0) {
				System.out.println(num);
			}
			
		}
	}

}
