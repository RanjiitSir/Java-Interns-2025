import java.lang.*;
import java.util.*;

public class Print_Letters_User_Specified_Range
{
  public static void main(String[] args)
  {
	char SCh = '\0', ECh = '\0';
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter Start Letter : ");
	SCh = S.next().charAt(0);
	
	System.out.print("\n Enter End Letter : ");
	ECh = S.next().charAt(0);

	System.out.println("\n Printing " + SCh + " to " + ECh + " => \n");
	
	if( SCh <= ECh )
	{
		while(SCh <= ECh)
		{
			System.out.println(SCh);
			SCh++;
		}
	}
	else
	{
		while(SCh >= ECh)
		{
			System.out.println(SCh);
			SCh--;
		}
	}
  }
}
