package NonStatic;

public class Empolyee {
       String name;
       int id = 101;
       double salary;
       
       Empolyee(String name,double salary){
    	   this.name=name;
    	   this.salary=salary;
       }
      
       public void getDetails() {
    	   System.out.println(id);
    	   System.out.println(name);
    	   System.out.println(salary);
       }
       {
    	   System.out.println("Empolyee Created");
       }
}
