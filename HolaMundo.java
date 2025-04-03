import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        String nombre;//Se declara la variable
        
        System.out.println("Hola Mundo");
        
        //leer nombre de usuario
        Scanner input = new Scanner(System.in); //para crear el input (para introducir datos el usuario)
        System.out.println("Introduce tu nombre: ");//imprimir por pantalla con println(salto de linea) con print(imprime en la misma línea)
        nombre = input.nextLine();//Se le da valor a la variable declarada anteriormente
        System.out.println("Tu nombre es " + nombre);
        nombre = "Maria";
        System.out.println("Hola " + nombre);
        
        
    }
}
