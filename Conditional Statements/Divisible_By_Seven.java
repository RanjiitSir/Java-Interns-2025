import java.lang.*;
import java.util.*;

public class Divisible_By_Seven
{
  public static void main(String[] args)
  {
		int No = 0;
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Number : ");
		No = S.nextInt();
		
		if(No == 0)
		{
			System.out.println("\n ERROR : Invalid Input \n (As Mathematically Dividing Zero By any integer gives INFINITE Result)");
		}
		else if( No % 7 == 0 )
		{
			System.out.println("\n Given Number " + No + " is Divisible By 7.");
		}
		else
		{
			System.out.println("\n Given Number " + No + " is Not Divisible By 7.");
		}

		System.out.println("\n Thanks.");
  }
}
