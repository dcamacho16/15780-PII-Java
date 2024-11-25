package seleccion_e_iteracion_04;

import java.util.Random;
import java.util.Scanner;

public class Adivina {
	public static void main(String args[]) {
		//Generamos número aleatorio
		Random random = new Random();
		//Opción 1
		int r = random.nextInt(5)+1;
		
		//Opcion 2
		//int r= (Math.abs(random.nextInt()) % 6) + 1; // Al hacer el modulo obtenemos un numero dentro del rango porque el resto siempre será menor que el dividendo
		//Se puede usar para hacer contadores circulares
		
		//Opcion 3
		//r = (int) random.nextFloat()*5 +1;
		//Math.round(random.nextFloat()*5 + 1);
		//Math.ceil(a);
		//Math.floor(a);
		System.out.println("Aleatorio:" + r);
		
		//Pedimos numero a usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero del 1 al 6: ");
		
		
		//Gestion de errores try/catch
		try {
			int n = sc.nextInt();
			// Comprobamos. Nos evitamos problemas mas adelante agregando la condición r == n.
			if (r == n)
				System.out.println("ACERTASTE!!!");
			System.out.println("FIN del programa.");
		} catch (Exception e)
		{
			System.out.print("No has introducido un numero");
			System.out.println(e);
		}
		
		
		
		
		
	}
}
