
import java.util.Random;
public class vectorestudiar {
	
	public static void main (String[] args) {
		Random rnd=new Random();
	
	
	int [] vec=new int[10]; //he creado un vector de 10 casillas
	
	for(int i=0;i<vec.length;i++) //no usar un numero entero en el length
		System.out.print(vec[i]+" ");
	
	
	int [] vec=new int[20]; //
	
	for(int i=0;i<vec.length;i++) 
		vec[i]=rnd.nextInt(31)+20; //(MAX-MIN+1)+MIN
		
		
		
		
	int [] vec=new int[20]; //
	int [] vec2=new int[20]; //
	
	vec2=vec;
	
		
		
	vec[5]=21;  //en el vector 5 le cambias al valor de 0 a 21
	vec[2]=vec[5]*2; //en el vector 2, ahora es igual al vector 5 y lo multiplica por 2
	System.out.println();
	for(int i=0;i<vec.length;i++)	
		System.out.print(vec[i]+" ");
		
		
	}
}

