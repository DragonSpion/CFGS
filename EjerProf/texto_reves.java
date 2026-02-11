
//suponemos que no hay errores de entrada
import java.util.Scanner;
public class texto_reves 
{
	public static void main(String [] args)
	{
		String texto;
				
		Scanner in=new Scanner(System.in);
		System.out.print("Introduce el texto: ");
		texto=in.nextLine();
		
		for (int i=texto.length()-1;i>=0;i--)
			System.out.print(texto.charAt(i));
		System.out.println("");
	}
}




