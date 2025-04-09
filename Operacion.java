/*Realizar un programa que pueda realizar una suma, una resta, una multiplicación o una división de dos números enteros, dependiendo de la decisión del usuario:
Si operación es igual a 1, realizar suma
Si operación es igual a 2, realizar resta
Si operación es igual a 3, realizar multiplicación
Si operación es igual a 4, realizar división*/

public class Operacion{
  public static void main(String args[]){

   int operacion = 5;
   int numero_uno = 8;
   int numero_dos = 4;
   int resultado = 0;
   
   if(operacion == 1){
    resultado = numero_uno + numero_dos;
    System.out.println("La suma es igual a: " + resultado);
   }  else if(operacion == 2){
      resultado = numero_uno - numero_dos;
      System.out.println("La resta es igual a: " + resultado);
     }  else if(operacion == 3){
       resultado = numero_uno * numero_dos;
       System.out.println("La multiplicacion es igual a: " + resultado);
       }else if(operacion == 4){
         resultado = numero_uno / numero_dos;
         System.out.println("La división es igual a: " + resultado);
         }
    else{
     System.out.println("La opción elegida es invalida");
   }
  }
}