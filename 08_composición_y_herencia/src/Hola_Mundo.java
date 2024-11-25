import java.io.*;

class Hola_Mundo {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);

		System.out.print("Escribe tu nombre: ");
		String nombre = input.readLine();
		System.out.print("Escribe tu edad: ");
		String edad = input.readLine();
		System.out.print("Escribe tu e-mail: ");
		String email = input.readLine();
		
		// Imprimimos el nobre almacenado en nombre
		System.out.println("Hola, ¡Tu nombre es " + nombre + "! \nTu edad es " + edad + ".\nTu email es " + email + "." );
	}
}