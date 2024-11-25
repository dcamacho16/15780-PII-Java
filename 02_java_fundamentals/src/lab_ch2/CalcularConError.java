package lab_ch2;

import java.util.Scanner;

public class CalcularConError {

// Método para calcular el valor de la función x(t)
	public static double calcularFuncion(double t, double a, double b, double c, double d) {
		return a * Math.pow(t, 3) + b * Math.pow(t, 2) + c * t + d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// Pedimos los valores para a, b, c y d
		System.out.print("Introduce el valor de a (decimal con '.'): ");
		String aInput = sc.next();
		if (aInput.contains(",")) {
			System.out.println("ERROR: Utiliza '.' como separador decimal en lugar de ','.");
			sc.close();
			return;
		}
		double a = Double.parseDouble(aInput);

		System.out.print("Introduce el valor de b (decimal con '.'): ");
		String bInput = sc.next();
		if (bInput.contains(",")) {
			System.out.println("ERROR: Utiliza '.' como separador decimal en lugar de ','.");
			sc.close();
			return;
		}
		double b = Double.parseDouble(bInput);

		System.out.print("Introduce el valor de c (decimal con '.'): ");
		String cInput = sc.next();
		if (cInput.contains(",")) {
			System.out.println("ERROR: Utiliza '.' como separador decimal en lugar de ','.");
			sc.close();
			return;
		}
		double c = Double.parseDouble(cInput);

		System.out.print("Introduce el valor de d (decimal con '.'): ");
		String dInput = sc.next();
		if (dInput.contains(",")) {
			System.out.println("ERROR: Utiliza '.' como separador decimal en lugar de ','.");
			sc.close();
			return;
		}
		double d = Double.parseDouble(dInput);

		sc.nextLine(); // Consumimos la nueva línea

// Pedimos el vector de tres datos
		System.out.print(
				"Introduce el vector con los tres datos t=[valor1 valor2 valor3] (separador decimal '.') y separado por dos espacios: ");
		String vector = sc.nextLine(); // Leemos toda la línea de entrada para el vector

// Limpiamos los corchetes y los espacios innecesarios
		vector = vector.substring(1, vector.length() - 1); // Quitamos los corchetes

		String[] datos = vector.split(" "); // Dividimos por dos espacios

// Comprobamos que el vector tenga tres elementos
		if (datos.length != 3) {
			System.out.println("ERROR: El vector debe contener exactamente tres valores.");
			sc.close();
			return;
		}

		try {
// Comprobamos si alguno de los valores contiene coma en lugar de punto
			for (String dato : datos) {
				if (dato.contains(",")) {
					System.out.println("ERROR: Utiliza '.' como separador decimal en los valores del vector.");
					sc.close();
					return;
				}
			}

// Convertimos los datos a valores numéricos
			double t1 = Double.parseDouble(datos[0]);
			double t2 = Double.parseDouble(datos[1]);
			double t3 = Double.parseDouble(datos[2]);

// Calculamos la función para cada valor de t
			double resultado1 = calcularFuncion(t1, a, b, c, d);
			double resultado2 = calcularFuncion(t2, a, b, c, d);
			double resultado3 = calcularFuncion(t3, a, b, c, d);

// Mostramos los resultados
			System.out.println("x(" + t1 + ")=" + a + "·(" + t1 + ")^3 + " + b + "·(" + t1 + ")^2 + " + c + "·(" + t1
					+ ") + " + d + "=" + resultado1);

			System.out.println("x(" + t2 + ")=" + a + "·(" + t2 + ")^3 + " + b + "·(" + t2 + ")^2 + " + c + "·(" + t2
					+ ") + " + d + "=" + resultado2);

			System.out.println("x(" + t3 + ")=" + a + "·(" + t3 + ")^3 + " + b + "·(" + t3 + ")^2 + " + c + "·(" + t3
					+ ") + " + d + "=" + resultado3);
		} catch (NumberFormatException e) {
			System.out.println(
					"ERROR: Asegúrate de que los valores del vector sean números y utilicen '.' como separador decimal.");
		}

		sc.close();
	}
}
