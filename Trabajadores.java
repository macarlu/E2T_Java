import java.util.Scanner;
/*La empres Coca-Cola Company solicita un sistema que determine los días de vacaciones a los que tiene derecho un trabajador, tomando en cuenta las siguientes características:
Existen tres departamentos dentro de la empresa con sus respectivas claves:
1. Departamento de Atención al cliente.(Clave 1).
2. Departamento de Logística.(Clave 2).
3. Gerencia.(Clave 3).

Trabajadores con clave 1(Atención al cliente):
- Con un año de servicio, reciben 6 días de vacaciones.
- Con 2 a 6 años de servicio, reciben 14 días de vacaciones.
- a partir de 7 años de servicio, reciben 20 días de vacaciones.

Trabajadores con clave 2(Logística):
- Con un año de servicio, reciben 7 días de vacaciones.
- Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
- a partir de 7 años de servicio, reciben 22 días de vacaciones.

Trabajadores con clave 3(Gerencia):
- Con un año de servicio, reciben 10 días de vacaciones.
- Con 2 a 6 años de servicio, reciben 20 días de vacaciones.
- a partir de 7 años de servicio, reciben 30 días de vacaciones.

Nota: El sistema debe solicitar el "Nombre", "Clave del departamento" y "Antigüedad" del trabajador, posteriormente mostrar un mensaje que contenga el nombre del trabajador y los días de vacaciones a los que tiene derecho.*/

public class Trabajadores{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre;
   int clave;
   int antiguedad;
   int vacaciones = 0;
   
   System.out.println("¿Cual es tu nombre?: ");
   nombre = in.nextLine();
   
   System.out.println("Introduce la clave de tu departamento: ");
   clave = in.nextInt();

   System.out.println("Introduce tu antiguedad en la compañia: ");
   antiguedad = in.nextInt();

   if(clave == 1 && antiguedad == 1){
     vacaciones = 6;
   System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

  }else if(clave == 2 && antiguedad == 1){
     vacaciones = 7;
     System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

   }else if(clave == 3 && antiguedad == 1){
     vacaciones = 10;
     System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

    }else if(clave == 1 && antiguedad > 1 && antiguedad < 7){
     vacaciones = 14;
     System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

     }else if(clave == 2 && antiguedad > 1 && antiguedad < 7){
      vacaciones = 15;
      System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

      }else if(clave == 3 && antiguedad > 1 && antiguedad < 7){
       vacaciones = 20;
       System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

       }else if(clave == 1 && antiguedad > 7){
     	vacaciones = 20;
        System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

	}else if(clave == 2 && antiguedad > 7){
     	vacaciones = 22;
        System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");

	 }else if(clave == 3 && antiguedad > 7){
     	  vacaciones = 30;
          System.out.println(nombre + " con clave " + clave + ", tiene " + antiguedad +" años de servicio. Merece " + vacaciones + " días de vacaciones.");
  }
 }
}
