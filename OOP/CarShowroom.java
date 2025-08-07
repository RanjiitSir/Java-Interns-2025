import java.lang.*;
import java.util.*;

class Car
{
		String clr = "";
		String md = "";

		void displayInfo()
		{
			System.out.println("Car model: " + md + ", Color: " + clr);
		}
}

public class CarShowroom
{
	public static void main(String[] args)
	{
		Car myCar1 = new Car();
		Car Car2 = new Car();
		
		myCar1.clr = "Red";
		myCar1.md = "Toyota";
		
		myCar1.displayInfo();
		
		Car2.clr = "Blue";
		Car2.md = "Inova";
		
		Car2.displayInfo();
	}
}