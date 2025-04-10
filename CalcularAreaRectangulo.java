import java.util.Scanner;

public class CalcularAreaRectangulo {
    
    public static void calculoArea(double base, double altura){

        double calculo = base * altura;
        //Para redondear usaremos printf ademas de %.2f\n como hemos puesto abajo
        System.out.printf("El area de este rectangulo es igual a %.2f\n", calculo);
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Bienvenidos al Calculador de areas");
        System.out.print("Introduce el valor para la base: ");
        base = in.nextDouble();
        System.out.print("Introduce el valor para la altura: ");
        altura = in.nextDouble();
        
        calculoArea(base, altura);

    }
}
