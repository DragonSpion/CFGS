
//programa para calcular la suma,resta,producto y división entre dos numeros
import java.util.Scanner;
public class calculadora 
{
	
	public static void main (String args[]) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int x =in.nextInt();
		System.out.print("Introduce el segundo número: ");
		int y =in.nextInt();
		int opcion;
		
		System.out.println( " Operaciones a realizar");
		System.out.println( "------------------------");
		System.out.println( "         1)x+y");
		System.out.println( "         2)x-y");
		System.out.println( "         3)x*y");
		System.out.println( "         4)x/y");
		System.out.println("");
		System.out.print("Elige una opcion:");
		opcion=in.nextInt();
		
			
		switch(opcion)
		{
				case 1:
						System.out.println("La suma es: "+(x+y));
						break;
				case 2:
						System.out.println("La resta es: "+(x-y));
						break;
				case 3:
						System.out.println("El producto es: "+(x*y));
						break;		
				case 4: if(y!=0){
							System.out.println("La división es: "+((double)x/y));
						}
						else{
							System.out.println("No se puede dividir por 0");
						}
						break;	
				
			
		}
		
	}
}






