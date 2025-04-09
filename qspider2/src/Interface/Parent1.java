package Interface;

public interface Parent1 {

}
class child extends Parent2 implements Parent1{
	public void display() {
		System.out.println("display");
	}
}