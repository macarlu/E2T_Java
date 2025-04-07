
public class BucleFor {

    public static void main(String args[]) {
        //bucle creciente
      for (int i = 1; i <= 5; i++){
        System.out.println("Iteracion numero: " + i);
    }
        //bucle decreciente
      for (int i = 10; i >= 0; i--){
        System.out.println("Cuenta atras: " + i);
    }
        //Recorriendo Arrays
      int[] numeros ={10, 20, 30, 40, 50};
      for (int i = 0; i < numeros.length; i++){
          System.out.println("Elemento " + numeros[i]);    
      }   
      
      String nombre = "Juan";
      for (int i = 0; i < nombre.length(); i++){
          System.out.println("Letra: " + nombre.charAt(i));    
        }
       }
      }
          
