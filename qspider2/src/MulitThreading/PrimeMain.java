package MulitThreading;

public class PrimeMain {
    public static void main(String[] args) {
		int s = 1;
		int e =10;
		
		for(int i=s;i<=e;i++) {
			PrimeThread p = new PrimeThread(i);
			p.start();
		}
	}
}
