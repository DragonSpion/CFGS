
public class Pruebaev2 {
	
	public static void mostrar(String texto){
		
		String textoTemp;
		textoTemp=texto;
		textoTemp="hola";
		System.out.println(textoTemp);
		
	}	
	

		
	public static void main (String[] args) {
		
		System.out.println("antes");
		mostrar("que el corazon, te sirva de guia");
		System.out.println("despues");
		mostrar2();
	
	}
}


public class Pruebaev21 {


	public static void mostrar2(inst x, int y){
	
		int suma;
		suma=sumar(2,3);
		System.out.println("la suma es: "+suma);
	
