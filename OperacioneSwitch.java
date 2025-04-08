import java.util.Scanner;

public class OperacioneSwitch{
  public static void main(String[] args){
int parametro;   
int num_uno = 5, num_dos =3, resultado = 0;
Scanner param = new Scanner(System.in);
System.out.println("Introduzca su opcion: ");
parametro = param.nextInt();

switch (parametro){

case 1: resultado = num_uno + num_dos;
	System.out.println("El resultado de la suma es: " + resultado);
	break;

case 2: resultado = num_uno - num_dos;
	System.out.println("El resultado de la resta es: " + resultado);
	break;

case 3: resultado = num_uno * num_dos;
	System.out.println("El resultado de la multiplicacion es: " + resultado);
	break;

case 4: resultado = num_uno / num_dos;
	System.out.println("El resultado de la division es: " + resultado);
	break;

default: System.out.println("Error, la opcion no existe");
	break;
    }
  }
}