import java.util.Scanner;

public class Ej4Ev2 {

    /**
     * metodo principal: este solo inicializa el Scanner y 
     * llama al método controlador para ejecutar todo el
     * proceso de validacion.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ejecutarProceso(sc); // llama al nuevo metodo controlador
        sc.close();
    }
    
    /**
     * metodo controlador: ejecuta el bucle principal de la aplicacion.
     * Repite el proceso de solicitar, validar y mostrar el resultado 
     * de la tarjeta hasta que el usuario decida no continuar.
     */
    public static void ejecutarProceso(Scanner sc) {
        char repetir;
        
        do {
            // I/O: solicitar la tarjeta
            System.out.println("\n--- INICIO DE VALIDACION DNIe---");
            System.out.print("Introduzca abajo, su DNIe ");
            System.out.println("para comprobar su autenticidad: ");
            String entrada = sc.nextLine();
            
            // logica: procesar la tarjeta (devuelve el mensaje del resultado)
            String resultadoMensaje = procesarDNI(entrada, sc);
            
            // I/O: mostrar el mensaje final de la operación
            System.out.println(resultadoMensaje);
            
            // I/O: preguntar al usuario si desea repetir
            repetir = preguntarRepetir(sc);
            
        } while (repetir == 's' || repetir == 'S');
        
        System.out.println("\n¡Proceso de validacion finalizada!");
    }

    /**
     * metodo de logica y flujo: comprueba la longitud, la formatea, 
     * confirma con el usuario y realiza la validacion de Luhn.
     */
     
    public static String procesarDNI(String entrada, Scanner sc) {
        String limpia = limpiar(entrada);
        String resultado = "";

        if (limpia.length() != 9) {
            resultado = "Esto no es un DNIe.";
        } else {
           
            boolean confirm = confirmar(sc);

            if (!confirm) {
                resultado = "Operación cancelada por el usuario.";
            } else {
				
                boolean valida = comprobar(limpia);

                if (valida) {
                    resultado = "El DNIe es valido.";
                } else {
                    resultado = "El DNIe NO es válido.";
                }
            }
        }
        return resultado;
    }
    
    /**
     * metodo auxiliar de I/O: Pregunta si el usuario desea repetir el proceso.
     * @param sc el objeto Scanner para la entrada de datos.
     * @return 's' o 'S' si desea repetir, 'n' o 'N' en caso contrario.
     */
    public static char preguntarRepetir(Scanner sc) {
        System.out.print("¿Desea introducir otro DNIe? (s/n): ");
        String lineaRepetir = sc.nextLine();
        
        if (lineaRepetir.length() > 0) {
            return lineaRepetir.charAt(0);
        }
        return 'n'; 
    }

    /**
     * metodo para limpiar la entrada de texto/numeros
    */
    public static String limpiar(String texto) {
        String numero = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            // solo incluye caracteres que son digitos ('0' a '8')
            if (c >= '0' && c <= '8') {
                numero += c;
            }
        }
        return numero;
    }
    /**
     * metodo para confirmar operacion
     */
    public static boolean confirmar(Scanner sc) {
        System.out.print("¿Es correcto el numero? (S/N): ");
        String resp = sc.nextLine();

        if (resp.length() == 0) return false;

        char r = resp.charAt(0);
        // devuelve verdadero si la respuesta comienza con 's' o 'S'
        return (r == 's' || r == 'S');
    }

    /**
     * metodo para hacer la operacion de luhn, comprobar que se realiza correctamente
     */
    public static boolean comprobar(String tarjeta) {
        int suma = 0;

        // repite de derecha a izquierda (desde el indice 15 hasta 0)
        for (int i = 8; i >= 0; i--) {
            // convierte el caracter a su valor numerico entero
            int dig = tarjeta.charAt(i) - '0';
            // calcula la posición relativa de derecha a izquierda (15 - i)
            int pos = 8 - i;

            // la duplicacion ocurre en cada segundo digito, comenzando desde la segunda posicion (pos % 2 == 1)
            if (pos % 2 == 1) {
                dig = dig * 2;
                // si el dígito duplicado es mayor que 9, se restan 9 (que es equivalente a sumar sus dígitos)
                if (dig > 9) {
                    dig = dig - 9;
                }
            }
            suma += dig;
        }
        // la tarjeta es valida si la suma total es divisible por 10
        return (suma % 10 == 0);
    }
}
