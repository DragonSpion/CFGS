import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, opcion;

        do {
			System.out.print("Menu");
            System.out.println("\n1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no valida, selecciona una de las 5 opciones");
                continue;
            }

            if (opcion == 5) {
                System.out.println("Saliendo de la calculadora, pulse cualquier tecla para cerrar el programa");
                break;
            }

            System.out.print("Introduce el número 1: ");
            n1 = sc.nextInt();

            System.out.print("Introduce el número 2: ");
            n2 = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("El resultado de la división es: " + ((double) n1 / n2));
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}
