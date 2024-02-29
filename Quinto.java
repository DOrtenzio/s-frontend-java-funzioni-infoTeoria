import java.util.Scanner;
public class Quinto {
  public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	int numero;
	  System.out.println ("Inserire numero:");
	  numero = in.nextInt ();
	if (isPari (numero))
	    System.out.println ("Il numero è pari");
	else
	    System.out.println ("Il numero non è pari");
  }
  public static boolean isPari (int x) {
	if (x % 2 == 0)
	    return true;
    else 
        return false;
  }
}
