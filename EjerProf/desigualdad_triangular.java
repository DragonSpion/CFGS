




import java.util.Scanner;

public class desigualdad_triangular {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c; //tamaño de los segmentos, no coordenadas
        System.out.print("Introduce el lado a:");
        a=sc.nextInt();
        System.out.print("Introduce el lado b:");
        b=sc.nextInt();
        System.out.print("Introduce el lado c:");
        c=sc.nextInt();
        
        if(c<=(a+b) && b<=(a+c) && a<=(c+b) ){
            if(a==b && a==c)
                System.out.println("El triangulo es equilatero");
            else if((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a) )
                 System.out.println("El triangulo es isosceles");
            else
                 System.out.println("El triangulo es escaleno");
            
        }
        else
             System.out.println("No es un triangulo");
    }
    
}
