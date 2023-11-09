package boletin;

import java.util.Scanner;
public class raizcuadrada {
	   public static void main( String[] args) {
		     int numero;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Introduce un número: ");
		   numero = sc.nextInt();
		   int i=1;
		  while (i < numero) {
			  if (i*i== numero) {
				  System.out.printf("La raiz cuadrada es " + i);
				  break;
			  }
			  i=i+1;
		  }

	   }
}