import java.util.Scanner;
public class Settimo {
  public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	int cateto1,cateto2,ipotenusa;
	   System.out.println ("Inserire il valore del primo cateto:");
	   cateto1 = in.nextInt ();
	   System.out.println ("Inserire il valore del secondo cateto:");
	   cateto2 = in.nextInt ();
	   System.out.println ("Inserire il valore dell'ipotenusa:");
	   ipotenusa = in.nextInt ();
	   if (isTerna (cateto1,cateto2,ipotenusa))
	     System.out.println ("E' una terna pitagorica");
	   else
	     System.out.println ("Non è una terna pitagorica");   
  }
  public static boolean isTerna (int x,int y,int ipotenusa) {
	if (y*y+x*x==ipotenusa*ipotenusa)
	    return true;
    else 
        return false;
  }
}