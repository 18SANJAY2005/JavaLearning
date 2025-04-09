package assignment;

import java.util.Arrays;
import java.util.Comparator;

public class Productdriver {
	public static void main(String[] args) {

		Product p1 = new Product("Poco Mobile",101, 3, 12000);
		Product p2 = new Product("Pen", 200, 5, 500);
		Product[] arr = { p1, p2};
		//Comparator c = new brandComparator();
        //Comparator c1 = new QuantityComparator();
		//Comparator c2= new priceComparator();
		Comparator c3 = new idComparator();
		//Arrays.sort(arr, c);
		//Arrays.sort(arr, c1);
		//Arrays.sort(arr, c2);
		Arrays.sort(arr,c3);
		for (Product p : arr)

			System.out.println(p);
	}
}