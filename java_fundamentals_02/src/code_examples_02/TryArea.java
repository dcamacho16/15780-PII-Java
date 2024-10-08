package code_examples_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryArea {
	public static void main(String[] args) throws Exception {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Introduce el radio: ");
		String text = input.readLine();
		try {
			// Opción 1: Convertir el texto a Double
			Double x = Double.valueOf(text);
			double r = x.doubleValue();
			// Opción 2: Alternativa para convertir directamente a primitivo double
			r = Double.parseDouble(text);
			System.out.println("El área de un círculo de radio " + r);
			double area = Math.PI * r * r;
			System.out.println(" es " + area);
		} catch (NumberFormatException e) {
			// Esto se ejecuta si el usuario ingresa algo que no es un número
			System.out.println("Error: El valor introducido no es un número válido.");
		}
	}
}

// IEEE Instituto de ingenieria electrica y electronica
//Paridad concepto utlizado para transmision de informacion y detectar si hay un fallo en internet
//Estandar 16bit unicode 2^16=64000