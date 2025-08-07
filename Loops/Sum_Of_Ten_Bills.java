import java.lang.*;
import java.util.*;

public class Sum_Of_Ten_Bills 
{
  public static void main(String[] args) 
  {
	int Amount = 0, Bill_Sum = 0, Cnt = 0;
	Scanner S = new Scanner(System.in);
	
	for(Cnt = 1; Cnt <= 10; Cnt++)
	{
		System.out.print("\n Enter " + Cnt + " Bill : ");
		Amount = S.nextInt();
	
		Bill_Sum = Bill_Sum + Amount;
	}
			
	System.out.println("\n Total Of All 10 Bills = " + Bill_Sum);
  }
}

