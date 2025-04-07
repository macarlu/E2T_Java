import java.util.Scanner;

public class ParImpar {

    public static void main(String args[]) {
      int numero;
      Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
      numero = input.nextInt();
      
      if (numero % 2 == 0){
          System.out.println("Es un numero par");
      }else{
          System.out.println("Es un numero impar");
      }    
  }
    
 }
