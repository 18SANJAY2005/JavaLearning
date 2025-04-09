package ArraysListPrograms;

import java.util.Objects;

public class Product {
         String name;
         int id;
         double price;
		public Product(String name, int id, double price) {
		
			this.name = name;
			this.id = id;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, name, price);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return id == other.id && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
		}
}
