import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String args[]) {
        int numero;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca un numero: ");
        
        numero = input.nextInt();
                
        
        if (numero < 0){
          System.out.println("Numero negativo");
        
        }else if(numero > 0){
           System.out.println("Numero Positivo");
         
         }else if(numero == 0){
            System.out.println("El numero es igual a cero");
          }
        
        
    }
}
