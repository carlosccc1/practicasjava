package boletin5;
import java.util.Scanner;

public class boletin5_6 {
	public static void main( String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String caracter;
		 System.out.println("Introduzca caracter  ");
         caracter=sc.next();
         
         if ( es_vocal(caracter))
		 System.out.println("Es vocal");
         else
        	 System.out.println("No es vocal");
         
	}

	static boolean es_vocal(String texto) {
		if  (texto.charAt(0)=='a' ||
		texto.charAt(0)=='e' ||
		texto.charAt(0)=='i' ||
		texto.charAt(0)=='o' ||
        texto.charAt(0)=='u' )
        return true;
		else
			return false;

		
		
		
	}
	
	
}
	
	
	
	
	

