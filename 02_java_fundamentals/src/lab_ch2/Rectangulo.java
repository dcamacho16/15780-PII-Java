/* 
 * He utilizado un if statement al final en la declaración del método main 
 * para asegurarme que el usuario ingresa valores positivos y no tenagivos 
 * 
 * Tal vez sea mejor eliminar o corregir para agregar un try catch
 * */
package lab_ch2;

import java.util.Scanner;

public class Rectangulo {
	double ladoMayor;
	double ladoMenor;

	// Cálculo del área
	double calcularArea() {
		return ladoMayor * ladoMenor;
	}

	// Cálculo del perímetro
	double calcularPerimetro() {
		return 2 * (ladoMayor + ladoMenor);
	}

	// Solicitamos los datos al usuario
	public void obtenerDimensiones() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Introduce el lado de mayor longitud (en metros): ");
			ladoMayor = sc.nextDouble(); // Si no es número, se lanzará NumberFormatException
		} catch (Exception e) {
			System.out.println("ERROR: El valor proporcionado para lado mayor no corresponde con un número.");
			sc.close(); // Cerramos el scanner
			return; // Finalizamos el programa
		}

		try {
			System.out.print("Introduce el lado de menor longitud (en metros): ");
			ladoMenor = sc.nextDouble(); // Si no es número, se lanzará NumberFormatException
		} catch (Exception e) {
			System.out.println("ERROR: El valor proporcionado para lado menor no corresponde con un número.");
			sc.close(); // Cerramos el scanner
			return; // Finalizamos el programa
		}

		sc.close(); // Cerramos el scanner correctamente
	}

	// Mostramos resultados
	public void mostrarResultado() {
		System.out.println("\nEl rectángulo introducido tiene unas dimensiones de " + ladoMayor + " m de ancho y "
				+ ladoMenor + " m de alto.");
		System.out
				.println("Su área será de " + calcularArea() + " m^2 y su perímetro es " + calcularPerimetro() + " m.");
	}

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.obtenerDimensiones();
		// Solo mostramos resultados si se introdujeron correctamente los valores
		try {
			if (rectangulo.ladoMayor > 0 && rectangulo.ladoMenor > 0) {
				rectangulo.mostrarResultado();
			}
		} catch (Exception e) {
			System.out.println("ERROR: No se pueden introducir valores númericos negativos.");
			return; // Finalizamos el programa
		}
	}
}
