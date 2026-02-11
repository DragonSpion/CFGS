import java.util.Random;
public class burbuja2
{
	
	public static void main (String args[])
	{
		int [] vec=new int[50];
		int aux;
		boolean cambio=true;
		int z;
		Random generator=new Random();
		for(int i=0;i<50;i++)
			vec[i]=generator.nextInt(100)+1;
			
		for(int i=0;i<50;i++)
			System.out.print(vec[i]+" ");
		
		System.out.println("");
		
		z=1;
		while(z<vec.length && cambio) {
			cambio=false;
			for(int j=0;j<(vec.length-z);j++) {
                 if(vec[j] > vec[j+1]){
					aux = vec[j];
					vec[j] = vec[j+1];
					vec[j+1] = aux;
					cambio=true;
				 }
				
			}
			z++;
		}
		
		
		for(int i=0;i<50;i++)
			System.out.print(vec[i]+" ");
		
     
   
		
		
		
	}
}

