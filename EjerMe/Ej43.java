import java.util.Scanner;
public class Ej43 {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
        double R=7.0, fp=0.8, ne=2.5, fl=0.5, fi=0.01, fc=0.01, L=1000.0;

        System.out.print("Introduce el valor de R: ");
        R=sc.nextLine(); //cambiar a line

        System.out.print("Introduce el valor de fp: ");
        fp=sc.nextLine();
        
        System.out.print("Introduce el valor de ne: ");
        ne=sc.nextLine();
        
        System.out.print("Introduce el valor de fl: ");
        fl=sc.nextLine();
        
        System.out.print("Introduce el valor de fi: ");
        fi=sc.nextLine();
        
        System.out.print("Introduce el valor de fc: ");
        fc=sc.nextLine();
        
        System.out.print("Introduce el valor de L: ");
        L=sc.nextLine();
        
        
        //comprobar con =""
        if(3){
			System.out.println("El resultado de la suma es: abada");
	}
		else{
	}	
        
        

	 System.out.println("El resultado de la ecuacion de Drake es: " + (R*fp*ne*fl*fi*fc*L));
        }
}
