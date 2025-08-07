import java.lang.*;
import java.util.*;

public class Even_Odd
{
  public static void main(String[] args)
  {
		int No = 0;
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Number : ");
		No = S.nextInt();
		
		if(No == 0)
		{
			System.out.println("\n Given Number " + No + " is Neutral.");
		}
		else if(No % 2 == 0)
		{
			System.out.println("\n Given Number " + No + " is EVEN.");
		}
		else
		{
			System.out.println("\n Given Number " + No + " is ODD.");
		}

		System.out.println("\n Thanks.");
  }
}
