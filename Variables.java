
public class Variables {   
    
   
    public static void main(String args[]) {
        int numero = 10;
        System.out.println("El valor de la variable numero es: " + numero);
        
        String anios = "7";
        int aniosEntero = Integer.parseInt(anios);//Para cambiar de string a integer
        System.out.println(aniosEntero);
        
        int number = 7;
        String number2 = Integer.toString(number);//Para cambiar de Integer a String
        System.out.println(number2.getClass());//Para obtener la clase (como type en python)
    }
}
