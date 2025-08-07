import java.lang.*;
import java.util.*;

public class PrintStar
{
  public static void main(String[] args)
  {
	int Cnt = 0;
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter Number : ");
	Cnt = S.nextInt();
	
	while(Cnt > 0)
	{
		System.out.println(" * ");
		Cnt--;
	}	
	
	System.out.println("\n ==============================\n");
  }
}
