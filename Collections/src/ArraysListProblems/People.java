package ArraysListProblems;

import java.util.Objects;

public class People implements Comparable<People>{
     String name;
     int id;
	public People(String name, int id) {
		
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
		People other = (People) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(People o) {
		if(this.name.equals(this.name))
			return 0;
		
		return -1;
	}
}
