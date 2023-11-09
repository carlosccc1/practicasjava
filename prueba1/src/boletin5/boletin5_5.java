package boletin5;
import java.util.Scanner;

public class boletin5_5 {
	   
		   static int calculaMayor(int numero1, int numero2) {
				 if ( numero1 > numero2)
					 return numero1;
				 else
					 return numero2;
		   }
		   
		   public static void main( String[] args) {
				 Scanner sc = new Scanner(System.in);


int numero1, numero2, numero3;

System.out.println("Introduzca el primer numero ");
		   numero1 = sc.nextInt();
System.out.println("Introduzca el segundo numero ");
           numero2 = sc.nextInt();
System.out.println("Introduzca el tercer numero ");
		   numero3 = sc.nextInt();
				   int resultado =calculaMayor(calculaMayor(numero1, numero2),numero3);
		   System.out.println("El numero que es mayor es:  "+ resultado);
				   
		   
	   }


}
