package code_examples_03;

import java.util.Scanner;

public class InviertePalabras {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita al usuario una cadena de texto con más de 4 palabras
		System.out.print("Introduce una cadena de texto con más de 4 palabras: ");
		String cadena = scanner.nextLine();

		// Imprime la cadena completa ingresada
		System.out.println("Cadena completa: " + cadena);

		// Calcula e imprime la longitud de la cadena
		int longitud = cadena.length();
		System.out.println("Longitud de la cadena: " + longitud);

		// Obtiene e imprime el primer carácter de la cadena
		char primerCaracter = cadena.charAt(0);
		System.out.println("Primer carácter: " + primerCaracter);

		// Calcula e imprime el antepenúltimo carácter de la cadena
		char antepenultimoCaracter = cadena.charAt(longitud - 3);
		System.out.println("Antepenúltimo carácter: " + antepenultimoCaracter);

		// Encuentra los índices de los primeros cuatro espacios en blanco en la cadena
		int primerEspacio = cadena.indexOf(" ");
		int segundoEspacio = cadena.indexOf(" ", primerEspacio + 1);
		int tercerEspacio = cadena.indexOf(" ", segundoEspacio + 1);
		int cuartoEspacio = cadena.indexOf(" ", tercerEspacio + 1);

		// Extrae la cuarta palabra de la cadena
		String cuartaPalabra;
		if (cuartoEspacio != -1) {
			cuartaPalabra = cadena.substring(tercerEspacio + 1, cuartoEspacio);
		} else {
			cuartaPalabra = cadena.substring(tercerEspacio + 1);
		}
		System.out.println("Cuarta palabra: " + cuartaPalabra);

		// Divide la cadena en palabras usando split
		String[] palabras = cadena.split(" ");
		StringBuffer resultado = new StringBuffer();

		// Recorre las palabras en orden inverso para construir la frase invertida
		for (int i = palabras.length - 1; i >= 0; i--) {
			// Convierte la primera palabra invertida a mayúsculas
			if (i == palabras.length - 1) {
				resultado.append(palabras[i].toUpperCase());
			} else {
				resultado.append(palabras[i]);
			}
			// Añade un espacio entre las palabras
			if (i > 0) {
				resultado.append(" ");
			}
		}

		// Imprime la frase con el orden de palabras invertido
		System.out.println("Frase invertida: " + resultado.toString());
		scanner.close();
	}
}
