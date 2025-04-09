import java.util.Scanner;

public class NumeroMayor {
    
    public static void verificarMayor(int num_uno,int num_dos){//Se meten entre parentesis lo que espera ser verificado

        if (num_uno > num_dos){
          System.out.println(num_uno + " es mayor que " + num_dos);

        }else{
            System.out.println(num_dos + " es mayor que " + num_uno);
        }
    }
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num_uno;
        int num_dos;
               
        System.out.println("Bienvenidos al verificador de numeros");
        System.out.println("Introduce el primer numero a verificar");
    
        num_uno = entrada.nextInt();
        System.out.println("Introduce el segundo numero a verificar");
        num_dos = entrada.nextInt();

        verificarMayor(num_uno, num_dos);//Metemos entre parentesis los valores para verificar

    }
    }
    

