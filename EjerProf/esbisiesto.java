import java.util.Scanner;
class esbisiesto
{
	public static void main(String [] args)
	{
		int anyo;
		boolean bisiesto;
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce el anyo: ");
		anyo=in.nextInt();
		bisiesto=false;
		if (anyo%4 == 0)
		{
			if (anyo%100==0)
			{
				if (anyo%400==0)
					bisiesto=true;
			}
			else
				bisiesto=true;
		}
		if (bisiesto)
			System.out.println("El anyo es bisiesto");
		else
			System.out.println("El anyo no es bisiesto");


	}
}
