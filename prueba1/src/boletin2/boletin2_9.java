package boletin2;
import java.lang.Math;
import java.util.Scanner;

public class boletin2_9 {
	public static void main( String[] args) {
		
		
		
		System.out.println("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if(numero < 10) {
			System.out.println(" El número tiene 1 cifra");
		}else {
			if(numero < 100) {
				System.out.println(" El número tiene 2 cifras");
			}else {
				if(numero < 1000) {
					System.out.println(" El número tiene 3 cifras");
				}else {
					if(numero < 10000) {
						System.out.println(" El número tiene 4 cifras");
		}

		
				}
			}
		
		}
		
	}
}
