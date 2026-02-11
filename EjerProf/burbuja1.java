import java.util.Random;
public class burbuja1
{
	
	public static void main (String args[])
	{
		int [] vec=new int[50];
		int aux;
		Random generator=new Random();
		for(int i=0;i<50;i++)
			vec[i]=generator.nextInt(100)+1;
			
		for(int i=0;i<50;i++)
			System.out.print(vec[i]+" ");
		
		System.out.println("");
		
		for(int i = 1; i < vec.length; i++) {
			for(int j = 0; j < (vec.length - i); j++) {
                 if(vec[j] > vec[j+1]){
					aux = vec[j];
					vec[j] = vec[j+1];
					vec[j+1] = aux;
            
				 }
			}
		}
		
		
		for(int i=0;i<50;i++)
			System.out.print(vec[i]+" ");
		
     
   
		
		
		
	}
}

