package ArraysListPrograms;

import java.util.ListIterator;

public class Movie {
       String title;
       String directName;
       double realesedYear;
	public Movie(String title, String directName, double duration) {
		
		this.title = title;
		this.directName = directName;
		this.realesedYear = duration;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", directName=" + directName + ", realesedYear=" + realesedYear + "]";
	}
	
	public boolean equals(Object o) {
		Movie m1 = (Movie)o;
		return this.title.equals(m1.title) && this.directName==m1.directName;
	}

}
