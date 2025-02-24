package looping;

public class OddEven {
	public static void odd(int x, int y) {
		System.out.println("Odd Numbers");
		for (int i = x; i <= y; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
	 public static void even(int x,int y) {   
		 System.out.println("Even Numbers");
		    for (int i=x;i<=y;i++) {
		    	if (i%2==0)
		    		System.out.println(i);
		    }
	 }
}
