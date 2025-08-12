package MulitThreading;

public class Program {
               public static void main(String[] args) throws InterruptedException {
				int sum=0;
				int mul=1;
				for(int i=0;i<=5;i++) {
					sum+=i;
				
				}
				System.out.println(sum);
				for(int i=1;i<=5;i++) {
					mul*=i;
				}
				System.out.println(mul);
			}
}
