import java.util.Scanner;
public class EJ4 {
	
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		
	
		int n1,n2,opcion;
		
		
		System.out.print("Introduce el numero 1: ");
		n1=sc.nextInt();
		
		System.out.print("Introduce el numero 2: ");
		n2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Selecciona la operación a realizar:");
		//opciones a realizar
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.print("Opción: ");
	
		String opcionStr = sc.nextLine();
		opcion = Integer.parseInt(opcionStr);
		
		//realizacion de operaciones, ademas de seleccionar el tipo de operacion
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
                    System.out.println("El resultado de la división es: " + (n1 / n2));
                } else {
                    System.out.println("Error: no se puede hacer la operacion.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
		
	}
}

