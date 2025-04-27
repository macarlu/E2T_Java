 //Realizar un programa quecontenga un vector cuya longitud sea proporcionado por el usuario,
 //posteriormente solicitar al usuariolos numeros necesarios para llenar todas las posiciones del vector, es decir,
 //si el usuario solicita un arreglo de 10 posiciones, entonces el programa deberáde solicitarle al usuario 10 números,
 //y finalmente se debe de imprimir el arreglo en pantalla de la siguiente manera:
 //[5][54][12][65][6][54][897] 

 import java.util.Scanner;

 public class vectoresDinamicos {
 
    public static void main(String[] args) {

        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos números deseas ingresar?: ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Dame el valor #" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
            
        }

    }
 }
