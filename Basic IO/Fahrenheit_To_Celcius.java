import java.lang.*;
import java.util.*;

public class Fahrenheit_To_Celcius
{
  public static void main(String[] args)
  {
        float Fht = 0.0f, Cel = 0.0f;

		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Temprature(in Fahrenheit) : ");
		Fht = S.nextFloat();

		Cel = (Fht - 32f) * (5f/9f);

		System.out.println("\n Temprature => " + Fht + "Fahrenheit = " + Cel + "Celcius");
  }
}