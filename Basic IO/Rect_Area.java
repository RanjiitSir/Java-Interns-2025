import java.lang.*;
import java.util.*;

public class Rect_Area
{
  public static void main(String[] args)
  {
        float Ht = 0.0f, Wd = 0.0f, Area = 0.0f;

		Scanner S = new Scanner(System.in);

		System.out.print("\n Enter Height of Rectangle : ");
		Ht = S.nextFloat();
		System.out.print("\n Enter Width of Rectangle : ");
		Wd = S.nextFloat();

		Area = Ht * Wd;

		System.out.println("\n Area of Rectangle is  =  " + Area + ".");
  }
}