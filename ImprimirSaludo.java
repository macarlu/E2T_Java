public class ImprimirSaludo {

    public void Saludo(){
        System.out.println("Hola, buenos dias");
        }
        public void imprimirConNombre(String nombre){
            System.out.println("Hola, " + nombre);
        }
        public static void main(String[] args) {
            ImprimirSaludo obj = new ImprimirSaludo();
            obj.Saludo();
            obj.imprimirConNombre("Juanma");
    }
}

        
    
   

