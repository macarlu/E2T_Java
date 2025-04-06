//Realizar un programa que calcule el promedio final de tres materias y que el programa nos indique si el alumno aprobó o reprobo.

public class Promedio{
  public static void main(String args[]){
 
  int matemáticas = 5;
  int biología = 5;
  int química = 7;
  int promedio = 0;
	
  promedio = (matemáticas + biología + química) / 3;

  if (promedio >= 6){//la condicion tiene que ir entre parentesis y luego se abre llaves
    System.out.println("El alumno aprobó " + promedio);
  }
  else{
    System.out.println("El alumno reprobó " + promedio);
	
  
  }
 }
}