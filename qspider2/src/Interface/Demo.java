package Interface;

public interface Demo {
	public abstract void display();
}
class sample implements Demo{
	public void display() {
		System.out.println("hi");
	}
}
