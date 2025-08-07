import java.lang.*;
import java.util.*;

public class Max_Bill_From_SevenA
{
  public static void main(String[] args) 
  {
	int Amount = 0, Max_Bill = Integer.MIN_VALUE, Cnt = 0;
	Scanner S = new Scanner(System.in);
	
	for(Cnt = 1; Cnt <= 7; Cnt++)
	{
		System.out.print("\n Enter " + Cnt + " Bill : ");
		Amount = S.nextInt();
	
		if( Amount > Max_Bill )
		{
			Max_Bill = Amount;
		}
	}
			
	System.out.println("\n Maximum Bill is = " + Max_Bill);
  }
}

