package boletin2;

import java.util.Scanner;
public class boletin2_04 {
	   public static void main( String[] args) {
		     final double PI = 3.1416;
		     double diametro, perimetro, area, radio;
		   int opcion;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("1.- Calcular el diámetro:/n ");
		   System.out.println("2.- Calcular el perímetro:/n ");
		   System.out.println("3.- Calcular el area:/n ");
		   System.out.println("Introduzca la opción deseada:  ");
		   opcion=sc.nextInt();
		   System.out.println("Introduzca el radio  : ");
		   radio=sc.nextDouble();
		   switch (opcion) {
		   case 1:
			   diametro =2*radio;
			   System.out.println("El diametro es: "+diametro);
			   break;
		   case 2:
			   perimetro =2*PI*radio;
			   System.out.println("El perimetro es: "+perimetro);
			   break;
		   case 3:
			   area =2*radio*radio;
			   System.out.println("El area es: "+area);
		   break;
           default:
		   System.out.println("Opcion invalida");
		 
		   
		   }
	   }
}