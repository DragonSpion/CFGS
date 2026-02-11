

import java.util.Scanner;
public class nota 
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		double nota;
		System.out.print("Introduce la nota numerica: ");
		nota=in.nextDouble();
		if (nota==10)
		  System.out.println( "Matricula de Honor");
		else if(nota>=8.5)
			System.out.println( "Sobresaliente");
		else if (nota>=6.5)
		        System.out.println ("Notable");
		else if( nota>=5)
			System.out.println ("Aprobado");
		else
			System.out.println ("Suspenso");
        
	
		
	}
}



