
//suponemos que no hay errores de entrada
import java.util.Scanner;
public class caracter_texto 
{
	public static void main(String [] args)
	{
		String texto;
		char letra;
		int n;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Introduce el texto: ");
		texto=in.nextLine();
		System.out.print("Introduce la letra a buscar: ");
		letra=in.nextLine().charAt(0);
		n=0;
		for (int i=0;i<texto.length();i++)
		{  	
			if (texto.charAt(i)==letra)
				n=n+1;
		}
		
		if (n==0)
		  System.out.println("No se ha encotrado el caracter en el texto");
		else
		  System.out.println("Hay "+n+" apariciones en el texto" );
	}
}
