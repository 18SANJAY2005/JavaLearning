package ArraysListPrograms;

import java.util.ArrayList;

public class movieDriver {
     public static void main(String[] args) {
		ArrayList<Movie> m = new ArrayList<Movie>();
		m.add(new Movie("assf","qwer",120.20));
		m.add(new Movie("aghj","zxcv",110.50));
		for(int i=0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
		Movie q = new Movie("assf","qwer",120.20);
		System.out.println(m.contains(q));
		String a = "assff";
		double d = 120.20;
		Movie m2 =null;
		
		for(Movie s:m) {
			if(a==s.title) {
				{
				m2=s;
				break;
				}
			}
		}
      if(m2!=null) {
    	  System.out.println(" Present");
      }else {
    	  System.out.println("not present");
      }
      System.out.println("-------------------------");
      //remove a element
      System.out.println(m);
      Movie f = new Movie("assf","qwer",120.20);
      if(m.remove(f)) {
    	  System.out.println("element is removed");
    	  System.out.println(m);
      }else {
    	  System.out.println("element is not present");
      }
	}
}
