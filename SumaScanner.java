import java.util.Scanner;

public class SumaScanner{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);//asi introducimos datos
   String nombre = "";
   int numeroUno = 0, numeroDos = 0, resultado = 0;
   
   System.out.println("¿Cual es tu nombre?");
   nombre = in.nextLine();//Espera una string, si fuera un int habria que poner nextInt()
   System.out.println("Dame el primer valor para tu suma: ");
   numeroUno = in.nextInt();
   System.out.println("Dame el segundo valor para tu suma: ");
   numeroDos = in.nextInt();
   resultado = numeroUno + numeroDos;
   System.out.println("Hola " + nombre + " el resultado de la suma es igual a: " + resultado);

  }
}