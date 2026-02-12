import java.util.Scanner;
public class Ej6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		
		System.out.print("Introduce el lado A: ");
		a=sc.nextInt();
		
		System.out.print("Introduce el lado B: ");
		b=sc.nextInt();
		
		System.out.print("Introduce el lado C: ");
		c=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Selecciona la operación a realizar:");
		//opciones a realizar
        System.out.println("Sumar: ");
        System.out.println("Restar: ");
        System.out.println("Dividir: ");
  
	
		String opcionStr = sc.nextLine();
		
		
		//realizacion de operaciones, ademas de seleccionar el tipo de operacion
		switch (c) {
            case 1:
                System.out.println("El resultado de la suma es: " + (a + b));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (a - b));
                break;
            case 3:
                if (b != 0) {
                    System.out.println("El resultado de la división es: " + (a / b));
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


