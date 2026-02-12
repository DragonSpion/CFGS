import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        //Aqui quitamos las barras "/" para solo obtener los numeros
        fecha = fecha.replace("/", "");

        //Lo convertimos el texto a número
        long numero = Long.parseLong(fecha);

        //Y reducimos hasta que quede un solo dígito
        while (numero >= 10) { 
            long suma = 0;
            while (numero > 0) {
                suma += numero % 10;  //añade el ultimo digito
                numero /= 10;         //quita el ultimo digito
            }
            numero = suma;  // actualiza el número con la suma
        }

        System.out.println("Tu numero de la suerte es: " + numero);
    }
}
