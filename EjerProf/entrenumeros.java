import java.util.Scanner;

public class entrenumeros {
	
	public static void main (String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Introduce el numero 1: ");
		int n1=in.nextInt();
		System.out.print("Introduce el numero 2: ");
		int n2=in.nextInt();
	
		if(n1<n2)
		{
			for(int i=n1;i<=n2;i++)
				System.out.print(i+" ");
		}
		else
		{
			for(int i=n1;i>=n2;i--)
				System.out.print(i+" ");
		}
		System.out.println("");
		
	}
}

