package Project;

import java.time.LocalDateTime;

public class Employee {
         String name;
         int id;
         double salary;
         int year;
         String email;
         long phoneno;
         
         {
        	 System.out.println(LocalDateTime.now());
         }
         {
        	 System.out.println("Empoyee Created");
         }
         
         Employee(String name,int id,double salary){
        	 this.name=name;
        	 this.id=id;
        	 this.salary=salary;
        	 
        	 
         }
         Employee(String name,int id,double salary,String email,long phoneno){
        	 this(name,id,salary);
        	 this.email=email;
        	 this.phoneno=phoneno;
         }
         public void addExp(int year) {
        	 this.year=year;
         }
         public void getDetails() {
        	 System.out.println("name:" + name);
        	 System.out.println("id:" + id);
        	 System.out.println("salary:" + salary);
        	 System.out.println("email:" + email);
        	 System.out.println("phoneno:" + phoneno);

         }
        
         
}

