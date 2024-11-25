//package code_examples_02;
import java.io.*;

public class AnyoNacimientoTry {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Introduce tu edad: ");
		try {
			String text = input.readLine();
			int age = Integer.parseInt(text);
			System.out.println("En este momento tú tienes " + age + " años,");
			int year = 2024 - age;
			System.out.println("por tanto, probablemente naciste en " + year);
		} catch (Exception e) {
			System.out.println("Se ha producido el siguiente error: " + e);
		}
	}
}
