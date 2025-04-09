package assignment;

public class Product implements Comparable{
 String brand;
 int id;
 int quantity;
 int price;
Product(String brand,int id,int quantity,int price) 
{
	this.brand=brand;
	this.id=id;
	this.quantity=quantity;
	this.price=price;
	}
@Override
public String toString() {
	return String.format("Brand Name : %s\n" + "Id : %d\n" + "Quantity : %d\n" + "Price : $%d\n"+"----------------------",brand,id,quantity,price );
}
public int compareTo(Object o)
{
	Product p=(Product)o;
	   if(this.id==p.id)
			return this.brand.compareTo(p.brand);
			return this.id-p.id;
}

}