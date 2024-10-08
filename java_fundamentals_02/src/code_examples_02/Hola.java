package code_examples_02;
import java.io.*;

class Hola {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader;
		reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		
		System.out.print("Introduce tu nombre: ");
		
		String nombre = input.readLine();
		System.out.println("Hola, �" + nombre + "!");
	}
}