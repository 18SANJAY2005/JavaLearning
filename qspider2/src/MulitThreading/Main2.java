package MulitThreading;

public class Main2 {
       public static void main(String[] args) {
		Test t1 = new Test();
		
		Thread t = new Thread(t1,"ABC");
		t.start();            
	}
}
