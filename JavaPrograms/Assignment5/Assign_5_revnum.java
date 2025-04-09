package Assignment5;
import java.util.ArrayList;
import java.util.Iterator;

public class Assign_5_revnum {
	public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList <Integer>();
	ArrayList<Integer>a=new ArrayList <Integer>();
	a.add(101);
	a.add(123);
	a.add(25);
	a.add(765);
	Iterator itr=a.iterator();
	while(itr.hasNext()) {
		Integer num=(Integer) itr.next();
		a1.add(rev(num));
			}
		System.out.println(a1.toString());
	}


	
	public static int rev(int a) {
		int res=0;
		int rem=0;
		while(a>0) {
			rem=a%10;
			res=(res*10)+rem;
			a=a/10;
		}
		return res;
	}
}