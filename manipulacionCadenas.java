import java.util.Scanner;
public class manipulacionCadenas {
    public static void main(String[] args) {
        
        String frase = "";
        int num_inicio = 0;
        int num_final = 0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la frase a contar: ");
        frase = entrada.nextLine();

        System.out.println("La frase introducida tiene " + frase.length() + " caracteres");

        System.out.println("¿Que parte de la frase desea obtener?");
        System.out.println("Introduce un número de inicio: ");
        num_inicio = entrada.nextInt();
        System.out.println("Introduce el número final: ");
        num_final = entrada.nextInt();
        System.out.println("La parte elegida corresponde a: " + frase.substring(num_inicio, num_final));
    }
}
