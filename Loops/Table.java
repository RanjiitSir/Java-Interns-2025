import java.lang.*;
import java.util.*;

public class Table
{
  public static void main(String[] args)
  {
		int No = 0, i = 0;
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Number : ");
		No = S.nextInt();
		
		System.out.print("\n Table of " + No + " is => \n\n");
		i = 1;
		
		while(i <= 10)
		{
			System.out.println(i*No);
			i++;
		}	
		
		System.out.println("\n Thanks.");
  }
}
