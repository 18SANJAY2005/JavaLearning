package ArraysListProblems;

import java.util.Objects;

import ArraysListPrograms2.Mobile;

public class Order implements Comparable<Order> {
        int orderId;
        String customerName;
        double totalAmount;
		public Order(int orderId, String customerName, double totalAmount) {
			
			this.orderId = orderId;
			this.customerName = customerName;
			this.totalAmount = totalAmount;
		}
		@Override
		public int hashCode() {
			return Objects.hash(customerName, orderId, totalAmount);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Objects.equals(customerName, other.customerName) && orderId == other.orderId
					&& Double.doubleToLongBits(totalAmount) == Double.doubleToLongBits(other.totalAmount);
			
		}
		public int compareTo(Order o) {
			if(this.totalAmount==o.totalAmount)
				return 0;
			if(this.totalAmount>o.totalAmount)
				return 1;
			return -1;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerName=" + customerName + ", totalAmount=" + totalAmount
					+ "]";
		}
}
