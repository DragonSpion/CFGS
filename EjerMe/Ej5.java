
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del 0 al 10: ");
        double nota = sc.nextDouble();

        if (nota < 5) {
            System.out.println("Estas suspendido");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Has aprobado");
        } else if (nota >= 6 && nota < 7.5) {
            System.out.println("Ni tan mal la nota, mi enorabuena");
        } else if (nota >= 7.5 && nota < 9) {
            System.out.println("Tienes un notable, bien echo");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("Tienes un sobresaliente");
        } else if (nota == 10) {
            System.out.println("Has conseguido un ¡Excelente!, felicidades");
        } else {
            System.out.println("La nota ni esta, ni se la espera");
        }
        sc.close();
    }
}
