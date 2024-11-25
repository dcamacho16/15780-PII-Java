/**
 * 
 */
package lab_ch2;
import java.util.Scanner;

public class SolicitaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se solicita nombre, apellidos, dirección, número de móvil y documento de identificación
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Introduce tu dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Introduce tu número de móvil: ");
        String numeroMovil = sc.nextLine();

        System.out.print("Introduce tu número de documento de identificación: ");
        String numeroDocumento = sc.nextLine();

        boolean numeroMovilEsValido = true;

        // Intentamos convertir el número de móvil a entero para verificar si es numérico y tiene 9 dígitos
        try {
            if (numeroMovil.length() != 9) { // Validamos también la longitud
                throw new NumberFormatException();
            }
            Long.parseLong(numeroMovil); // Usamos Long para soportar números más largos
        } catch (NumberFormatException e) {
            numeroMovilEsValido = false; // Si ocurre una excepción, el número no es válido
        }

        // Imprimimos los datos por pantalla
        System.out.println("\nHola " + nombre + " " + apellidos + ", tu ID es " + numeroDocumento + 
                           ", vives en " + direccion + " y tu número de teléfono " + 
                           (numeroMovilEsValido ? "es " + numeroMovil : "proporcionado no es correcto."));

        // Cerramos el scanner
        sc.close();
    }
}
