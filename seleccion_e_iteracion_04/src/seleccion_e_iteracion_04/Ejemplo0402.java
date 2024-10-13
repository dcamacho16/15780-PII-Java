package seleccion_e_iteracion_04;

import java.util.Random;
public class Ejemplo0402 {
	public static void main(String args[]) {
		Random random = new Random();
		int m = random.nextInt();
		System.out.println("m = " + m);
		int n = random.nextInt();
		System.out.println("n = " + n);
		if (m < n)
			System.out.println("El minimo es " + m);
		else
			System.out.println("El minimo es " + n);
	}
}
