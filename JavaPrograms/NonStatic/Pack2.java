package NonStatic;

public class Pack2 {
     public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		System.out.println(Pack1.name);
		System.out.println(p1.name);
	}
}
