package Oops;

public class BookDriver {
         public static void main(String[] args) {
			Book b1 = new Book();
			Book b2 = new Book();
			Book b3 = new Book();
			b1.title = "harry potter";
			b1.price = 200;
			System.out.println("Title :" + b1.title);
			System.out.println("Price :" + b1.price);
			b2.title = "nasa";
			b2.price = 300;
			System.out.println("Title :" +b2.title);
			System.out.println("Price :" +b2.price);
			b3.title = "Nature";
			b3.price = 400;
			System.out.println("Title :" +b3.title);
			System.out.println("Price :" +b3.price);
		}
}
