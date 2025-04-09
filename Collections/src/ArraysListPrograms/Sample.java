package ArraysListPrograms;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		
	
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al.size());
        al.add(10);
        al.add(20);
        al.add(30);
//        al.add(10);
//        al.add(null);
       System.out.println(al);
       System.out.println(al.addAll(0, al));
       ArrayList<Integer> a2 = new ArrayList<>();
       a2.add(10);
       a2.add(20);
       a2.add(30);
//       a2.add(10);
//       a2.add(null);
       al.addAll(a2);
       System.out.println(al);
} 
}
