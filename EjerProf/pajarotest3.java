

public class pajarotest3{
	
	public static void main (String args[]) {
		
		pajaro3 [] vec=new pajaro3[5];
		/*for(int i=0;i<vec.length;i++)
			vec[i]=new pajaro3("amarillo","pollito",1,1);*/
		
		vec[0]=new pajaro3("amarillo","pp",1,2);
		vec[1]=new pajaro3("rojo","psoe",4,2);
		vec[2]=new pajaro3("verde","iz",4,2);
		vec[3]=new pajaro3();
		vec[4]=new pajaro3();
		vec[1]=null;
		
		for(int i=0;i<vec.length;i++)
			if(vec[i]!=null)
				System.out.println(vec[i]);
			
		System.out.println(vec[0].getNumPajaros());
	}
}

