package prueba1;


             import java.util.Scanner;
             public class GoodMorning {
            	 public static void main(String[] args) {
            		 Scanner sc = new Scanner(System.in);
            		 int hora;
            		 System.out.println(" Introduzca la hora : ");
            		 hora = sc.nextInt();
            		 if (hora <=12) {
            			 System.out.println(" Buenos dias ");
            		 }else {
            			 System.out.println(" Buenas tardes");
            		 }
            	 }

}
