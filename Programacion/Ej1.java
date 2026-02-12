
public class Ej1 {
	
	public static void main (String[] args) {
	int v50,v20,v10,v5,v1,valor;
	int resto;
	
	valor=184;
	
	v50=50;
	v20=20;
	v10=10;
	v5=5;
	v1=1;
	
	
	v50=valor/50;
	resto=valor%50;
	v20=resto/20;
	resto=resto%20;
	v10=resto/10;
	resto=resto%10;
	v5=resto/5;
	resto=resto%5;
	v1=resto/1;
	resto=resto%1;
	
	
	
	
	System.out.println("billetes de 50:"+v50);
	System.out.println("billetes de 20:"+v20);
	System.out.println("billetes de 10:"+v10);
	System.out.println("billetes de 5:"+v5);
	System.out.println("billetes de 1:"+v1);
		
	}
}

