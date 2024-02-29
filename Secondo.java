import java.util.Scanner;
public class Secondo {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    double base, altezza;
	    System.out.println("Inserire altezza:");
	    altezza=in.nextDouble();
	    System.out.println("Inserire base:");
	    base=in.nextDouble();
	    double a=isPrimo(base,altezza);
	    System.out.println("L'area è:"+a);
		
		
	}
	public static double isPrimo(double x,double y) {
		return x*y;
	}
}
