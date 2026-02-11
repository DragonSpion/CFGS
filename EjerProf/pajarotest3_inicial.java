

public class pajarotest3_inicial {
	
	public static void main (String args[]) {
		
		
		pajaro3 pepe=new pajaro3();
		
		pepe.setColor("amarillo");
		
		System.out.println(pepe.getColor());
		
		pajaro3 luis=new pajaro3("rojo","luis",2,3);
	
		if(luis.sobrepeso())
			System.out.println("Tiene sobrepeso");
		else
			System.out.println("No Tiene sobrepeso");
		
		System.out.println(luis.getNumPajaros());
		pajaro3 eva=new pajaro3();
	
		System.out.println(luis.getNumPajaros());
	}
}

