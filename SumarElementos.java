

public class SumarElementos {

    public static void main(String args[]) {
        int [] numeros = {5,8,6,9,4,6,25,254,18963};
        int resultado = 0;
        
        for (int i = 0; i < numeros.length; i++){
        
          resultado += numeros[i];
        }
          System.out.println(resultado);
    }
}
