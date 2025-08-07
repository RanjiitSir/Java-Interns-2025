import java.lang.*;
import java.util.*;

public class Subject_Marks_Total_Per
{
  public static void main(String[] args)
  {
		int Phy = 0, Chem = 0, Maths = 0, Tot = 0;
        float Per = 0.0f;

		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Physics Marks : ");
		Phy = S.nextInt();
		System.out.print("\n Enter Chemistry Marks : ");
		Chem = S.nextInt();
        System.out.print("\n Enter Maths Marks : ");
		Maths = S.nextInt();

		Tot = Phy + Chem + Maths;

        Per = (float)Tot / 3;

		System.out.println("\n Total Marks =  " + Tot + ".");
		System.out.println("\n Percentage  =  " + Per + ".");
  }
}