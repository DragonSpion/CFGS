/*    si el número es par, se lo divide por dos;
    si es impar, se le multiplica tres y se le suma uno;
    la sucesión termina al llegar a uno. n forma parte de la secuencia*/
import java.util.Scanner;
public class secuencia_collatz {
	
	public static void main (String args[]) {
		Scanner in=new Scanner(System.in);
		int n;		
		System.out.print("Introduce un numero: ");
		n=in.nextInt();
		while(n!=1){
			System.out.print(n+" ");
			if(n%2==0)	//par
				n=n/2;
			else 
				n=n*3+1;
		}
		System.out.println(n);
	}
}

