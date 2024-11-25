package code_examples_02;
import java.util.Scanner; //Se utiliza para importar la libreria y todos sus paquetes.

class HolaScanner {
	public static void main(String[] args){ // Utilizamos una excepcion de entrada y salida
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");

		try {
			// L�neas de c�digo que puedan dar problemas
			String nombre = sc.nextLine();
			System.out.println("Hola, �" + nombre + "!");
		} catch (Exception e) {
			// Imprimimos la excepci�n que haya surgido
			System.out.println("Ha habido un error");
		}


	}
}
// cambiamos codigo para que funcione con scanner
