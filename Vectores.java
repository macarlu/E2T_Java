import java.util.Scanner;
public class Vectores {//arreglo unidimensional

    public static void main(String[] args) {
        
        int numeros[] = new int[5];//Asi es como se define un vector(lista)

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número para la posición 0 del vector: ");
        numeros[0] = entrada.nextInt();
        System.out.println("Introduce el número para la posición 1 del vector: ");
        numeros[1] = entrada.nextInt();
        System.out.println("Introduce el número para la posición 2 del vector: ");
        numeros[2] = entrada.nextInt();
        System.out.println("Introduce el número para la posición 3 del vector: ");
        numeros[3] = entrada.nextInt();
        System.out.println("Introduce el número para la posición 4 del vector: ");
        numeros[4] = entrada.nextInt();

        System.out.println("Este es el contenido del vector: " + numeros[0] + "," + numeros[1] + "," + numeros[2] + "," + numeros[3] + "," + numeros[4]);

        System.out.println("numeros");//Asi me indica el lugar en memoria


    }
}