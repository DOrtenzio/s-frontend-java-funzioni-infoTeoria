import java.util.Scanner;
public class Nono {
  public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	double c1,c2,c3;
	   System.out.println ("Inserire il valore del primo numero:");
	   c1 = in.nextDouble ();
	   System.out.println ("Inserire il valore del secondo numero:");
	   c2 = in.nextDouble ();
	   System.out.println ("Inserire il valore del secondo numero:");
	   c3 = in.nextDouble ();
	   System.out.println ("Il valore minimo tra 3 è: "+ minimo(c1,c2,c3));
  }
  public static double minimo (double x,double y,double z) {
    double minimo=x;
    if (y<minimo)
        minimo=y;
    else if (z<minimo)
        minimo=z;
    return minimo;
  }
}