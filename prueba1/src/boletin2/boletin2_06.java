package boletin2;

import java.util.Scanner;
public class boletin2_06 {
	   public static void main( String[] args) {
		     double horas = 0, salario = 0;
		   Scanner sc = new Scanner(System.in);
		System.out.println("Indica cuantas horas trabajas: ");
		 horas=sc.nextDouble();
		 
		 if (horas >40) {
			 salario = 40*12;
			 horas = horas - 40;
			 salario = salario + horas * 16;
		 }else {
			 salario = horas*12;
			 
		   
		   }
		 System.out.println("El empleado "
		 		+ "tiene un sueldo de "+salario+" euros");
	   }
}