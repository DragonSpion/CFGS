import java.util.Scanner;
public class Prueba3 {
	
	public static void main (String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String texto;
		int Edad;
		double peso;
		
		System.out.print("Introduce tu nombre:");
		texto=sc.nextLine();
		
		System.out.print("Edad:");
		Edad=sc.nextInt();
		
		System.out.print("Introduce tu peso:");
		peso=sc.nextDouble();
		
		System.out.println("Hola "+texto+" ¿Como estas? tienes "+Edad+" años y pesas unos "+peso+" Kg");
		
		
		
		
		
	}
}

