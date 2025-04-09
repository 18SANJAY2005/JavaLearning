package ArraysListPrograms;

public class Student {
      String name;
      int age,id; 
      
      Student(String name,int age,int id){
    	  this.name=name;
    	  this.age=age;
    	  this.id=id;
      }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
}
