
public class Ej1Dinero {
	
	public static void main (String[] args) {
		
		int dinero=200;
		
		int b50,b20,b10,b5;
		int resto;
		
		b50=dinero/50;
		resto=dinero%50;
		b20=resto/20;
		resto=resto%20;
		b10=resto/10;
		resto=resto%10;
		b5=resto/5;
		resto=resto%5;
		
		
		System.out.println(b50+" Billetes de 50");
		System.out.println(b20+" Billetes de 20");
		System.out.println(b10+" Billetes de 10");
		System.out.println(b5+" Billetes de 5");
		System.out.println(resto+" Modedas de 1");
		
	}
}

