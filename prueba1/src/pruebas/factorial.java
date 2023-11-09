package pruebas;
import java.util.Scanner;
public class factorial {
public static double factorial (double numero) {
	double resultado;
	if (numero==1) {
		return 1;
	}else {
		resultado = numero *factorial(numero-1);
		
	}
	return resultado;
}


public static void main(String[] args) {
	double resultado, numero;
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número: ");
	numero = sc.nextDouble ();
	resultado = factorial(numero);
	System.out.print("El factorial de "+numero+" es "+resultado);
}
}
