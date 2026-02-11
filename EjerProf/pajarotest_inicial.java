

public class pajarotest_inicial {

	public static void main (String args[])
	{
		pajaro pepe=new pajaro();
		pajaro luis=new pajaro();
		pepe.color="rojo";
		pepe.nombre="Pepe";
		
		luis.color="verde";
		luis.nombre="luis";
		
		pepe.peso=50;
		luis.peso=2;
		
		pepe.altura=10;
		luis.altura=1;
		
		System.out.println(pepe.sobrepeso());
		System.out.println(luis.sobrepeso());
		System.out.println(pepe.color);
		pepe.color="amarillo";
		System.out.println(pepe.color);
	}
}

