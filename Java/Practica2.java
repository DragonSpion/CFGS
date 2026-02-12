import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        while (contador < 10) {
            System.out.print("Introduce un número (que no sea repetido ni sea el 0): ");
            int num = sc.nextInt();

            //Si el numero es 0, lo ignora y da mensaje de error
            if (num == 0) {
                System.out.println("Meh error, el 0 no vale, vuelve a repetirlo.");
                continue;
            }

            // Comprobar si ya existe un numero introducido
            boolean repetido = false;
            for (int i = 0; i < contador; i++) {
                if (numeros[i] == num) {
                    repetido = true;
                    break;
                }
            }
			//Aqui se dedice si el numero introducido se guarda o no
            if (repetido) {
                System.out.println("Acabas de repetir el mismo numero, anda introduce otro");
            } else {
                numeros[contador] = num;
                contador++;
            }
        }

        System.out.println("\nNúmeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
