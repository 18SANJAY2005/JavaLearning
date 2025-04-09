package Object;

public class Empolyee {
          int id;
          String name;
          int age;
          public Empolyee(int id, String name, int age) {
			  this.name=name;
			  this.age=age;
        	  this.id=id;
		}
          public int hashCode() {
        	  return id+age+name.hashCode();
          }
}
