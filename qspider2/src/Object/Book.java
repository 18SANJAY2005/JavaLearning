package Object;

public class Book implements Comparable {
	String name;
	double price;
	
	Book(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public int compareTo(Object o) {
		Book b = (Book)o;
		if(this.price==b.price)
			return 0;
		if(this.price>b.price)
			return 1;
		return -1;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

}
