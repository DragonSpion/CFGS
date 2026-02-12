import java.util.Scanner;
public class Prueba4 {
	
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
        int n1, n2, opcion;

        System.out.print("Introduce el numero 1: ");
        n1=sc.nextInt();

        System.out.print("Introduce el numero 2: ");
        n2=sc.nextInt();


		sc.nextLine(); // limpia buffer pendiente
		String opcionStr = sc.nextLine(); // lee la línea completa
		opcion = Integer.parseInt(opcionStr); // convierte a int

        System.out.println("Selecciona la operación a realizar:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.print("Opción: ");
		texto=sc.nextLine();

        if (opcion == o1) {
            System.out.println("El resultado de la suma es: " + (n1 + n2));
        } else if (opcion == o2) {
            System.out.println("El resultado de la resta es: " + (n1 - n2));
        } else if (opcion == o3) {
            System.out.println("El resultado de la multiplicación es: " + (n1 * n2));
        } else if (opcion == o4) {
            if (n2 != 0) {
                System.out.println("El resultado de la división es: " + ((double)n1 / n2));
            } else {
                System.out.println("Error: División por cero.");
            }
        } else {
            System.out.println("Opción inválida.");
        }

    }
}
