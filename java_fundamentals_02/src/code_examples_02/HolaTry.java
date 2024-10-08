package code_examples_02;
import java.io.*; //Se utiliza para importar la libreria y todos sus paquetes.

class HolaTry {
	public static void main(String[] args) throws IOException { // Utilizamos una excepcion de entrada y salida
		InputStreamReader reader;
		reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Introduce tu nombre: ");
		//String nombre = "";
		try {
			// L�neas de c�digo que puedan dar problemas
			String nombre = input.readLine();
			System.out.println("Hola, �" + nombre + "!");
		} catch (Exception e) {
			// Imprimimos la excepci�n que haya surgido
			System.out.println("Ha habido un error");
		}


	}
}
// Puede servir al conectarse con un servidor; utilizar una funcion try o catch