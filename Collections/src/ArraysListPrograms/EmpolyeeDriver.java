package ArraysListPrograms;

import java.util.ArrayList;

public class EmpolyeeDriver {
    public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<Employee>();
		em.add((new Employee("ABC",123)));
		em.add((new Employee("DEF",234)));
		em.add((new Employee("GHI",567)));
		
		String keyName = "ABC";
		ArrayList<Employee> result = new ArrayList<Employee>();
		for(Employee e : em) {
			if(keyName.equals(e.name)) {
				result.add(e);
			}
		}
		if(result.size()==0) {
			System.out.println("no element");
		}else {
			System.out.println(result);
		}
		ArrayList<Movie> zz = new ArrayList<Movie>();
		zz.add((new Movie("qwee","asdf",2005)));
		zz.add((new Movie("qwxe","asjf",2012)));
        double keyYear = 2013;
        ArrayList<Movie> result1 = new ArrayList<Movie>();
        for(Movie el : zz) {
			if(keyYear== el.realesedYear) {
				result1.add(el);
			}
		}
		if(result1.size()==0) {
			System.out.println("no element");
		}else {
			System.out.println(result1);
		}

		
		
	}
}
