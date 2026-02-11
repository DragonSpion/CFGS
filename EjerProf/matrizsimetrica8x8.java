import java.util.Random;
public class matrizsimetrica8x8 {
	
	
	public static void main (String args[]) {
		
	Random aleatorio = new Random();
	int alea=0;
	boolean salir=false;	
	boolean incluido=false;	
	int indice=0;
		
	int [] [] matriz = new int [8] [8];
	
	int [] aux = new int [25];


	for(int i=0;i<matriz.length;i++)
	{	
		for(int j=0;j<matriz[0].length;j++)
		{
			salir=false;
			while(!salir)
			{
                salir=true;
				alea=aleatorio.nextInt(30)+10;
				for(int z=0;z<aux.length;z++)	//while
				{	
					
					if(aux[z]==alea)		
						salir=false;
		
				}
             }
               incluido=false;
                        
			while (indice<aux.length && !incluido)
			{
				if(aux[indice]==0){
					aux[indice]=alea;
					incluido=true;
                    indice++;
				}
				
					
			}
			matriz[i][j]=alea;
			matriz[j][i]=alea;
			
		}
	
	}
	
	
	
	
	for(int i=0;i<matriz.length;i++)
	{	
		for(int j=0;j<matriz.length;j++)
			System.out.print(matriz[i][j]+" ");
		System.out.println();
	}
	
	}
}
