import java.lang.*;
import java.util.*;

class Animal
{
	void Walk()
	{
		System.out.println("Animal Can Walk");
	}
	
	void sound()
	{
		System.out.println("Animal makes a sound");
	}
}

// Dog class inherits from Animal
class Dog extends Animal
{
	void sound()			
	{
		System.out.println("Dog barks");
	}
}


// Using inheritance
public class Zoo
{
	public static void main(String[] args)
	{
		Dog myDog = new Dog();
		
		myDog.sound(); // Output: Dog barks
		myDog.Walk();	
	}
}