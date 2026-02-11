
class dinero
{
	public static void main(String [] args)
	{
		int b50,b20,b10,b5,m1;
		int cantidad,resto;
		cantidad=12032;

		b50=cantidad/50;
		resto=cantidad%50;
		b20=resto/20;
		resto=resto%20;
		b10=resto/10;
		resto=resto%10;
		b5=resto/5;
		resto=resto%5;
		m1=resto;
		System.out.println( b50+" billetes de 50, "+b20+" billetes de 20, "+b10+" billetes de 10, "+b5+" billetes de 5 y "+m1+ " monedas de 1");


	}
}
