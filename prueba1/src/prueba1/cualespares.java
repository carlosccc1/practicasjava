package prueba1;

           import java.util.Scanner;
           public class cualespares {
        	   public static void main( String[] args) {
        		   Scanner sc = new Scanner(System.in); 
        		   int numero1, numero2;
        		   String texto;
        		   System.out.println(" Introduce el primer número ");
        		   numero1 = sc.nextInt();
        		   System.out.println(" Introduce el segundo número ");
        		   numero2 = sc.nextInt();
        		   if (numero1 % 2 ==0) {
        			   if (numero2 % 2 ==0) {
        				   System.out.println("Los dos números son pares");
        			   }
        			   else {
        				   System.out.println("El primer número es par");
        			   }
        				   
    			   }
        		   else  {
        			   if (numero2 % 2 !=0) {
        				   System.out.println("Ningún numero es par");
        			   }
        			   else {
        				   System.out.println("El segundo número es par");
        			   }
        			   
        		   }
        			  
        		   
        	   }
        	   
           }
        		   
        		   
     
           
         
       	   
           
 
        	   
            	 

             
             
             
             
             
             
               

    
                   
                	   
                   


