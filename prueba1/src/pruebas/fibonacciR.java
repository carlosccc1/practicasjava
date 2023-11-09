package pruebas;
import java.util.Scanner;
public class fibonacciR {
public static void fibonacciR (double ant_ant, double ant) {
	double numero = ant_ant + ant;
	if (numero<1000) {
		System.out.println(" , "+numero);
		fibonacciR(ant,numero);
	}
}


public static void main(String[] args) {
	
	System.out.print("Serie Fibonacci: 0 , 1 ");
	fibonacciR(0,1);
}
}
