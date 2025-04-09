package Object;

public class Student1 implements Comparable{
       int age;
       int marks;
       String name;
       
       Student1(int age,int marks,String name){
    	   this.age=age;
    	   this.marks=marks;
    	   this.name=name;
       }
       

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student1 s = (Student1)o;
 	   if(this.marks==s.marks)
 		  return this.name.compareTo(name);
 		   return this.marks-s.marks;
 	   
	}
	
}
