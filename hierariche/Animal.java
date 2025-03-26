package hierariche;

class Animal  {
       void makeSound() {
    	   System.out.println("MakingSound");
       }
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}


