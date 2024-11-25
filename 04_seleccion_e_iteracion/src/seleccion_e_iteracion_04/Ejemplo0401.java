package seleccion_e_iteracion_04;

import java.util.Random;
public class Ejemplo0401 {
	public static void main(String args[]) {
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("n = " + n);
		if (n < 0)
			 System.out.println("****  n < 0");
		System.out.println("Hasta luego.");
	}
}
