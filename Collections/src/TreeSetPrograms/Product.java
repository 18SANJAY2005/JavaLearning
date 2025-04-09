package TreeSetPrograms;

public class Product  implements Comparable<Product>{
      String name;
      double price;
      int id;
	public Product(String name, double price, int id) {
	
		this.name = name;
		this.price = price;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.name);
		
	}
}
