import java.util.Scanner;
public class Terzo {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    double base, altezza;
	    System.out.println("Inserire altezza:");
	    altezza=in.nextDouble();
	    System.out.println("Inserire base:");
	    base=in.nextDouble();
	    double p=isPrimo(base,altezza);
	    System.out.println("Il perimetro del rettangolo è:"+p);
	}
	public static double isPrimo(double x,double y) {
		return x*2+y*2;
	}
}
