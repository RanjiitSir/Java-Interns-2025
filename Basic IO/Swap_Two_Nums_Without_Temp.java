import java.lang.*;
import java.util.*;

public class Swap_Two_Nums_Without_Temp
{
  public static void main(String[] args)
  {
        int No1 = 0, No2 = 0;

		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter 1st Number : ");
		No1 = S.nextInt();
		System.out.print("\n Enter 2nd Number : ");
		No2 = S.nextInt();

		System.out.println("\n Before Swapping =>  " + "\t 1st Number = " + No1 + "\t 2nd Number = " + No2);
		
		/// LOGIC for Swapping
		No1 = No1 + No2;
		No2 = No1 - No2;
		No1 = No1 - No2;
		
		System.out.println("\n After Swapping =>  " + "\t 1st Number = " + No1 + "\t 2nd Number = " + No2);
  }
}