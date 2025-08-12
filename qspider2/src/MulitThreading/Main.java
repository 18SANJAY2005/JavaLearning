package MulitThreading;

public class Main {
	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();
		System.out.println(t1.threadId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("______________________");
        task1();
        }
	public static void task1() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.threadId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("______________________");
		task2();
	}
	public static void task2() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.threadId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("______________________");
	}
}
