import java.util.Scanner;
public class MenuDoWhile {

    public static void main(String args[]) {
        boolean estado = true;
        
          Scanner input = new Scanner(System.in);
          
        do{
            System.out.println("Seleccione una opcion: ");
            System.out.println("Pulse 1 para un nuevo registro.");
            System.out.println("Pulse 2 para ver todos los registros");
            System.out.println("Pulse 3 para salir");
            String opcion = input.nextLine();
            
            switch (opcion){
            
                case "1":
                    System.out.println("Has seleccionado nuevo registro");
                    break;
                case "2":
                    System.out.println("Has seleccionado ver todos los registros");
                    break;
                case "3":
                    System.out.println("Has seleccionado salir");
                    System.out.println("Adios");
                    estado = false;
                    break;
                default:
                    System.out.println("La opcion no es correcta");
                    break;
            }
        }while (estado == true);
            
    }
}
