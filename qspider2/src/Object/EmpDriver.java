package Object;

public class EmpDriver {
	public static void main(String[] args) {
		
	
      Empolyee e1= new Empolyee(18, "asd", 123);
      Empolyee e2 = new Empolyee(18, "asd", 123);
      Empolyee e3 = new Empolyee(18, "asd", 123);
      System.out.println(e1.hashCode());
      System.out.println(e2.hashCode());
      System.out.println(e3.hashCode());


}  
}