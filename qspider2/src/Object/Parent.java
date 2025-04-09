package Object;

public class Parent {
	       String name;
	       int id;
           int age;
           Parent(int age,String name,int id){
        	   this.name=name;
        	   this.id=id;
        	   this.age=age;
           }
           public boolean equals(Object o) {
        	   Parent p = (Parent)o;
        	   return this.age==p.age && this.name.equals(p.name) && this.id==p.id;
           }
}
