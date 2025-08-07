import java.lang.*;
import java.util.*;

public class Print_No1_No2_Times
{
  public static void main(String[] args)
  {
	int No1 = 0, No2 = 0;
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter 1st Number : ");
	No1 = S.nextInt();
	System.out.print("\n Enter 2nd Number : ");
	No2 = S.nextInt();
	
	if(No2 <= 0)
	{
		System.out.println("\n Invalid Input.");
		return;
	}
	
	System.out.println("\n Printing 1st Number 2nd Number of Times => \n");
	
	while(No2 > 0)
	{
		System.out.println(No1);
		No2--;
	}
  }
}
