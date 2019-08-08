package assignment_1;

public class Main {

	public static void main(String[] args){
		Dog d1 = new Dog("Fido", "Brown");
		
		Dog d2 = new Dog("Rover", "White");
		
		System.out.println("Dog, d1, has instance variables: " + d1.name + " and " + d1.color + ".");
		System.out.println("Dog, d2, has instance variables: " + d2.name + " and " + d2.color + ".");
		
		System.out.println("Both dogs have the same class variables: HasTail = " + Dog.hasTail + " and Barks = " + Dog.barks + " because all Dogs have them.");

	}
}
