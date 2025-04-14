import java.util.Scanner;

public class InicioSesion {
    
    public static void main(String[] args) {
        String usuario = "Juanma";
        String contrasena = "P@55w0rd";
        String user = "";
        String password = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu usuario: ");

        user = entrada.nextLine();

        System.out.println("Introduce tu contrasena: ");

        password = entrada.nextLine();

        if(usuario.equals(user) && contrasena.equals(password)){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Usuario o contrasena incorrecto");
        }
    }
}
