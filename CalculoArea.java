
import java.util.Scanner;

public class CalculoArea {

    public static void main(String args[]) {
        int base;
        int altura;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Introduzca la altura: ");
        altura = sc.nextInt();

        area = base * altura;
        System.out.println("El Area es igual a " + area);

    }
}
