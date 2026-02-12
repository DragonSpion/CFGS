
public class Ej3 {
	

    public static void main(String[] args) {
        int a,b,c,d,e;
        int f,g;

		a=34;
		b=23;
        c=55;
        d=57;
        e=11;

//crea una variable para guardar la F y asi poder hacer referencia a ella, lo que se quiere conseguir es que diga, la a es igual a 34

		//operacion para saber cual numero es mayor
    
        if (a > b) {
            f = a;
        } else {
            f = b;
        }

        if (c > f) {
            f = c;
        }

        if (d > f) {
            f = d;
        }
        
        if (e > f) {
            f = e;
        }
        //fin de la operacion
        
        
System.out.println("el numero mas grande es el " +f);

	
		//operacion para saber cual es el menor

		if (a < b) {
            g = a;
        } else {
            g = b;
        }

        if (c < g) {
            g = c;
        }

        if (d < g) {
            g = d;
        }
        
        if (e < g) {
            g = e;
        }

		//fin de la operacion
System.out.println("el numero mas bajo es el " +g);

		
}

}
		
