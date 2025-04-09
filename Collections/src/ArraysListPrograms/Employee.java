package ArraysListPrograms;

import java.util.Objects;

public class Employee {
           String name;
           int id;
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + "]";
		}
		public Employee(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
}
