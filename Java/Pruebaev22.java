

import java.util.Scanner;
public class Pruebaev22 {
	
	public static boolean esNumero(String texto){
		boolean numero=false;
		for(int i=0;i<texto.length();i++){
			if(texto.charAt(i)<'0' || texto.charAt(i)>'9')
				numero=true;
		}
		return numero;
	}	
		
	
	public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			String num1Text,num2Text;
			int num1,num2;
			
			do{
				System.out.print("Inroduce el primer numero:");
				num1Text=sc.nextLine();
			}while(!esNumero(num1Text));
			num1=Integer.parseInt(num1Text);
			
			do{
				System.out.print("Inroduce el primer numero:");
				num2Text=sc.nextLine();
			}while(!esNumero(num2Text));
			num2=Integer.parseInt(num2Text);
			
			
			System.out.println("La suma es:"+(num1+num2));
			
			
	}
}
