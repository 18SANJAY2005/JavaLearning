package MulitThreading;

public class PrimeThread extends Thread {
   int num;
   public PrimeThread(int num) {
	   this.num=num;
   }
	public void run() {
		int count=0;
	   for(int i=1;i<num;i++) {
		   if(num%i==0) {
			   count++;
		   }
		   if(count==2) {
			   System.out.println(num);
		   }
	   }
   }
}
