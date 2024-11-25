package code_examples_02;
import java.io.*;

public class Area {
	public static void main(String[] args) throws Exception {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Introduce el radio: ");
		String text = input.readLine();
		Double x = Double.valueOf(text);
		double r = x.doubleValue();
		System.out.println("El área de un círculo de radio " + r);
		double area = Math.PI * r * r;
		System.out.println(" es " + area);
	}
}
// Si usamos un número negativo del radio no da error. Eso sale de que el radio se eleva al cuadrado.