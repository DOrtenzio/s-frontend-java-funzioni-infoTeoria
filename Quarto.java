import java.util.Scanner;
public class Quarto
{
  public static void main (String[]args)
  {
	Scanner in = new Scanner (System.in);
	int anno;
	  System.out.println ("Inserire anno:");
	  anno = in.nextInt ();
	if (isBisestile (anno))
	    System.out.println ("L'anno è bisestile");
	else
	    System.out.println ("L'anno non è bisestile");
  }
  public static boolean isBisestile (int x) {
	boolean isBis = true;
	if (x % 4 != 0)
	  isBis=false;
    else if (x%100==0){
        if (x%400!=0)
            isBis=false;
    }
    return isBis;
  }
}
