package Object;

import java.util.Arrays;

public class BookDricer {
      public static void main(String[] args) {
		Book b1 = new Book("asd", 100);
		Book b2 = new Book("zxc", 200);
		Book[] arr = new Book[3];
		arr[0]=b1;
		arr[1]=b2;
		arr[2]=new Book("aqw",400);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(b1.compareTo(b2));
				
	}
}
