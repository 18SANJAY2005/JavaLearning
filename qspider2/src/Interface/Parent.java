package Interface;

public interface Parent {
    default void vechile() {
    	System.out.println("it is starting");
    }
}
class bike implements Parent{
	
}
class car implements Parent{
	@ Override
	public void vechile() {
		System.out.println("car is starting");
	}
}
