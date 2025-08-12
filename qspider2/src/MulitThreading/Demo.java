package MulitThreading;

public class Demo {
         public static void main(String[] args) {
			
        	 MyThread t1 = new MyThread();
        	 System.out.println(t1.getName());
        	 t1.start();
        	 
        	 for(int i=0;i<10;i++) {
        		 System.out.println(Thread.currentThread().getName());
        	 }
		}
} 
