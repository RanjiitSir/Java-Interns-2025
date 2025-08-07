import java.lang.*;
import java.util.*;

public class Factorial
{
  public static void main(String[] args)
  {
	int No = 0, Temp = 0, Fact = 0;
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter a Positive Number : ");
	No = S.nextInt();
	
	if(No <= 0)
	{
		System.out.println("\n Invalid Input.");
		return;
	}
	
	for(Temp = No, Fact = 1; Temp > 0; Temp--)
	{
		Fact = Fact * Temp;
	}
	
	System.out.println("\n Factorial of " + No + " is = " + Fact + ".");
  }
}
