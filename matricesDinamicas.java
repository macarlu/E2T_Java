import java.util.Scanner;

public class matricesDinamicas {
    public static void main(String[] args) {
        
    
    int filas = 0;
    int columnas = 0;
    int contador = 1;

    Scanner entrada = new Scanner(System.in);
    System.out.print("¿Cuantas filas hay en su matriz?: ");
    filas = entrada.nextInt();
    System.out.print("¿Cuantas columnas hay en su matriz?: ");
    columnas = entrada.nextInt();

    int numeros [][] = new int [filas][columnas];//creo la estructura de la matriz de esta manera

    //En una matriz primero siempre van las filas y despues las columnas
    for (int j = 0; j < filas; j++){//recorro las filas
        for (int i = 0; i < columnas;i++){//recorro las columnas
            numeros[j][i] = contador;//ingreso en estas posiciones el valor de la variable contador
            contador++;//y la incremento para la siguiente vuelta
            System.out.print("[" + numeros[j][i] + "]");
            }
        System.out.println("");
        }
    }
}
