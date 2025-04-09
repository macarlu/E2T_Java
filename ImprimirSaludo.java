public class ImprimirSaludo {

    public static String saludo(String nombre){
        
        String saludo = "Hola. Bienvenido " + nombre;
        
        return saludo;
        }
    
        public static String error (String nombre){
            String error = "No pudimos validar tus datos. ¿" + nombre + " es tu usuario.";
                    
            return error;
        }
        
        public static void verificar(String usuario, String contrasenia){
      
            String usuarioValido = "Juanma";
            String contraseniaValida = "MiContrasenia";
         
            if (usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia)){
                System.out.println(saludo(usuario));
                return;
        }
            System.out.println(error(usuario));
         
        }
        
        public static void main(String[] args) {
            String usuario = "Juanma";
            String contrasenia = "MiContrasenia";
            
            verificar(usuario,contrasenia);  
    }
}

        
    
   

