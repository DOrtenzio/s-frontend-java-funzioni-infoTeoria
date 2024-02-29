import java.util.Scanner;
public class Ottavo {
  public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	double cateto1,cateto2,ipotenusa;
	   System.out.println ("Inserire il valore del primo cateto:");
	   cateto1 = in.nextDouble ();
	   System.out.println ("Inserire il valore del secondo cateto:");
	   cateto2 = in.nextDouble ();
	     System.out.println ("Il valore dell'ipotenusa è: "+allaRicercaDellIpotenusa (cateto1,cateto2));
  }
  public static double allaRicercaDellIpotenusa (double x,double y) {
    return Math.sqrt(x*x+y*y);
  }
}