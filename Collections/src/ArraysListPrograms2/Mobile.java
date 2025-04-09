package ArraysListPrograms2;

public class Mobile implements Comparable<Mobile>{
	
	String brand;
	double price;
	int ram;
	int rom;
	
	
	Mobile(String brand, double price, int ram, int rom) {
		
	this.brand = brand;
	this.price = price;
	this.ram = ram;
	this.rom = rom;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + ", rom=" + rom + "]";
	}


	@Override
	public int compareTo(Mobile o) {
		if(this.price==o.price)
			return 0;
		if(this.price>o.price)
			return 1;
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	

}
