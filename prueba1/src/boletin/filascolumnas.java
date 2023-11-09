package boletin;

import java.util.Scanner;
public class filascolumnas {
	   public static void main( String[] args) {
		   Scanner sc = new Scanner(System.in); 
		   int numero, suma=0;
		   System.out.println("Introduce un número: ");
		   numero = sc.nextInt();
		  
		   for (int i=0 ;i<=numero;i=i+2){
			   System.out.print (i+" - ");
suma +=i;
		   
		   }
		   System.out.println("La suma es :  "+ suma);

	   }
}