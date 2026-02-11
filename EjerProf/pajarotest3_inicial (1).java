

public class pajarotest3_inicial {
	
	public static void main (String args[]) {
		
		
		/*pajaro3 pepe=new pajaro3();
		
	
		pepe.setColor("amarillo");
		
		System.out.println(pepe.getColor());
		
		pajaro3 luis=new pajaro3("rojo","luis",2,4);
		
		if(luis.sobrepeso())
			System.out.println("tiene sobrepeso");
		else
			System.out.println("no tiene sobrepeso");
	
		pepe.numPajaros=9;
		System.out.println(luis.numPajaros);
		System.out.println(luis);*/
		
		pajaro3 merluzo=new pajaro3("rojo","luis",2,4,100);
		
		Pluma [] temp=new Pluma[100];
		temp[0]=new Pluma("verde",1);
		//...
		
		merluzo.setPlumas(temp);
		System.out.println(merluzo.getPlumas()[0].getPeso());
		
	}
}

