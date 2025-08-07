import java.lang.*;
import java.util.*;

public class PrintName
{
  public static void main(String[] args)
  {
	int Cnt = 0;
	String Name = "";
	
	Scanner S = new Scanner(System.in);

	System.out.print("\n Enter Count : ");
	Cnt = S.nextInt();
	
	S.nextLine();
		
	System.out.print("\n Enter You Name : ");
	Name = S.nextLine();
	
	while(Cnt > 0)
	{
		System.out.println(Name);
		Cnt--;
	}	
	
	System.out.println("\n ==============================\n");
  }
}
