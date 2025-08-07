import java.lang.*;
import java.util.*;

public class Max_Bill_From_Seven 
{
  public static void main(String[] args) 
  {
	int Amount = 0, Max_Bill = 0, Cnt = 0;
	Scanner S = new Scanner(System.in);
	
	for(Cnt = 1; Cnt <= 7; Cnt++)
	{
		System.out.print("\n Enter " + Cnt + " Bill : ");
		Amount = S.nextInt();
		
		if( (Cnt == 1) || ( Amount > Max_Bill ))
		{
			Max_Bill = Amount;
		}
	}
			
	System.out.println("\n Maximum Bill is = " + Max_Bill);
  }
}

