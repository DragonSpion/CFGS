import java.util.Scanner;

public class Ej3Ev2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Introduzca una frase: ");
            String original = sc.nextLine();

            if (sonIguales(original)) {
                System.out.println("Es un palíndromo");
            } else {
                System.out.println("No lo es, sigue intentándolo");
            }

            System.out.print("¿Lo intentas de nuevo? (s/n): ");
            String lineaRepetir = sc.nextLine();

            repetir = 'n';
            if (lineaRepetir.length() > 0) {
                repetir = lineaRepetir.charAt(0);
            }

        } while (repetir == 's' || repetir == 'S');

        System.out.println("Nos vemos");
        sc.close();
    }

    // Metodo para eliminar los espacios
    public static String eliminarEspacios(String texto) {
        String sinEspacios = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c != ' ') {
                sinEspacios = sinEspacios + c;
            }
        }

        return sinEspacios;
    }

    // Metodo para invertir la frase
    public static String invertirFrase(String texto) {
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida = invertida + texto.charAt(i);
        }

        return invertida;
    }

    // Metodo para saber si las cadenas son iguales
    public static boolean sonIguales(String original) {
        String limpia = eliminarEspacios(original);
        String invertida = invertirFrase(limpia);

	// Compara las dos cadenas, la limpia y la invertida
		return limpia.equals(invertida);
    }
}
