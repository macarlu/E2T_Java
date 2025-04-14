import java.util.Scanner;

public class ComparaNombres {
    
    public static void main(String[] args) {

        String nombre1 = "";
        String nombre2 = "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer nombre: ");
        nombre1 = entrada.nextLine();
        System.out.println("");
        System.out.println("Introduce el segundo nombre: ");
        nombre2 = entrada.nextLine();

        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres introducidos coinciden");
        }else{
            System.out.println("Los nombres son distintos");
        }
    }

}
