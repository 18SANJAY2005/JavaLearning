package Object;

public class Driver1 {
	public static void main(String[] args) {
		
	
        Parent p1 = new Parent(18, "san", 123);
        Parent p2 = new Parent(18, "san", 123);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2)  );
}
}