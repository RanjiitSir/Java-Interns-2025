import java.lang.*;
import java.util.*;

public class Check_Vowel
{
  public static void main(String[] args)
  {
		char ch = '\0';
		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter a Letter : ");
		ch = S.next().charAt(0);
		
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("\n Given Letter " + ch + " is Vowel");
		}
		else
		{
			System.out.println("\n Given Letter " + ch + " is not Vowel");
		}

		System.out.println("\n Thanks.");
  }
}
