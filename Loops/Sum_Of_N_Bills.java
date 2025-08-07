import java.lang.*;
import java.util.*;

public class Sum_Of_N_Bills 
{
  public static void main(String[] args) 
  {
	int Amount = 0, Bill_Sum = 0, Cnt = 1;
	Scanner S = new Scanner(System.in);
	
	while(true)			/// UNCONDITIONAL WHILE LOOP
	{
		System.out.print("\n Enter " + Cnt + " Bill : ");
		Amount = S.nextInt();
	
		if(Amount <= 0)
		{
			break;
		}
		
		Bill_Sum = Bill_Sum + Amount;
		Cnt++;
	}
	
	System.out.println("\n Total Of All Bills = " + Bill_Sum);
  }
}

