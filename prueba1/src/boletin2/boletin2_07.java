package boletin2;
import java.lang.Math;
import java.util.Scanner;
public class boletin2_07 {
	   public static void main( String[] args) {
		     double a, b, c, solucion1, solucion2;
		      
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Introduzca a : ");
		    a=sc.nextDouble();
		    System.out.println("Introduzca b : ");
		    b=sc.nextDouble();
		    System.out.println("Introduzca c : ");
		    c=sc.nextDouble();
		   double discriminante = (Math.pow(b,  2) - (4 * a * c) );
		   if (discriminante >= 0) {
			   if (discriminante == 0) {
				   solucion1 = ((-b) - (4 * a * c))  / (2 * a);
				   System.out.println("Una sola solución: "+ solucion1);
			   }else {
				   solucion1 = ((-b) + Math.sqrt(Math.pow(b,  2) - (4 * a * c))) / (2 * a);
				   solucion2 = ((-b) - Math.sqrt(Math.pow(b,  2) - (4 * a * c))) / (2 * a);
				   System.out.println("2 soluciones . Solucion1: "+solucion1+ " Solucion2: "+solucion2);
			   }
		   }
	   }
}