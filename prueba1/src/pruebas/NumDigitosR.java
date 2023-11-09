package pruebas;
import java.util.Scanner;
public class multiplicar {
public static double multiplicaR (double num1, double num2) {
	double resultado;
	if (num2==1) {
		return num1;
	}else {
		resultado = num1 + multiplicaR(num1,num2-1);
		
	}
	return resultado;
}


public static void main(String[] args) {
	double resultado, numero1, numero2;
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número1: ");
	numero1 = sc.nextDouble ();
	System.out.print("Introduce un número2: ");
	numero2 = sc.nextDouble ();
	resultado = multiplicaR(numero1,numero2-1);
	System.out.print("La multiplicacion es: "+resultado);
}
}
