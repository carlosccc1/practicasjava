package boletin5;
import java.util.Scanner;

public class boletin5_4 {

static void calculaMayor(int numero1, int numero2) {
	 if ( numero1 > numero2)
		 System.out.println("El primer numero es mayor"  + numero1);
	 else
		 System.out.println("El segundo numero es mayor"  + numero2);
}



	 public static void main( String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int numero1, numero2, calculaMayor;
		 System.out.println("Introduce el primer numero");
		 numero1 = sc.nextInt();
		 System.out.println("Introduce el segundo numero");
		 numero2 = sc.nextInt();
		 calculaMayor(numero1, numero2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }

	
	
	
	
	
	
	
	
	
	

}
