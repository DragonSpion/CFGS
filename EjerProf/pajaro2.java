
public class pajaro2
{
		String color;
		String nombre;
		double peso;
		double altura;
		
		pajaro2(String c,String n, double p,double a)
		{
			color=c;
			nombre=n;
			peso=p;
			altura=a;
		}
		
		
		String sobrepeso()
		{
			if(peso*altura>10)
				return "Sobrepeso";
			else
				return "normal";
		}
		
	public static void main (String args[])
	{
		pajaro2 pepe=new pajaro2("rojo","Pepe",20,10);
			
		System.out.println(pepe.color);
		pepe.color="verde";
		System.out.println(pepe.color);
		System.out.println(pepe.sobrepeso());
		pepe.altura=2;
		pepe.peso=3;
		System.out.println(pepe.sobrepeso());
		
	}
}

