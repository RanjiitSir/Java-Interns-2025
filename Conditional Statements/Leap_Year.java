import java.lang.*;
import java.util.*;

public class Leap_Year
{
  public static void main(String[] args)
  {
		int Year = 0;
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Year Value : ");
		Year = S.nextInt();
		
		if( Year < 1000 || Year > 9999 )
		{
			System.out.println("\n Invalid Year Value");
		}
		else if(Year % 4 == 0)
		{
			System.out.println("\n Given Year " + Year + " is Leap Year.");
		}
		else
		{
			System.out.println("\n Given Year " + Year + " is Not Leap Year.");
		}

		System.out.println("\n Thanks.");
  }
}
