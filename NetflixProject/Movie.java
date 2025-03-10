package NetflixProject;

import java.util.Scanner;

public class Movie {
         String title;
         String genere;
         String director;
         String language;
         
      
    public Movie(){
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie");
		title = sc.next();
		System.out.println("Enter the DirectorName");
		director = sc.next();
		System.out.println("Enter the genere");
		genere = sc.next();
		System.out.println("Enter the language");
		language = sc.next();
		
    	
    }


	@Override
	public String toString() {
		return "Movie [title=" + title + ", genere=" + genere + ", director=" + director + ", language=" + language
				+ "]";
	}
}
