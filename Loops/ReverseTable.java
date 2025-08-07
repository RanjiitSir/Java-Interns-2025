import java.lang.*;
import java.util.*;

public class ReverseTable
{
  public static void main(String[] args)
  {
	int No = 0, i = 0;
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter Number : ");
	No = S.nextInt();
	
	System.out.print("\n Reverse Table of " + No + " is => \n\n");
	
	for(i = 10; i >= 1; i--)
	{
		System.out.println(i*No);
	}	
	
	System.out.println("\n ==============================\n");
  }
}
