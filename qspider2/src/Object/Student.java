package Object;

public class Student {
       String name;
       int id;
       
       Student(String name,int id){
    	   this.id=id;
    	   this.name=name;
       }
       public String toString() {
    	   return "Name : " + name + "\n" + "Id : " + id;
       }
}
