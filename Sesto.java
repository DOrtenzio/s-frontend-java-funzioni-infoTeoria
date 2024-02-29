import java.util.Scanner;
public class Sesto {
  public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	int numero,n,n2;
	System.out.println ("Quante coppie di numeri vuoi inserire:");
	  numero= in.nextInt ();
	  for (int i=0;i<numero;i++ ){
	   System.out.println ("Inserire un numero:");
	   n = in.nextInt ();
	   System.out.println ("Inserire un secondo numero:");
	   n2 = in.nextInt ();
	   if (isMultiplo (n,n2))
	     System.out.println (n2+" è multiplo di "+n);
	   else
	     System.out.println (n2+" non è multiplo di "+n);   
	   }
	  
  }
  public static boolean isMultiplo (int x,int y) {
	if (y%x==0)
	    return true;
    else 
        return false;
  }
}