package code_examples_02;
public class Hola_Mundo {
	public static int a = 0;
	private int velocidad;

	static void print(String dato) {
		System.out.print("Hola " + dato + a);
	}

	static void print(String dato, int d) {
		System.out.print("Hola " + dato + a + d);
	}

	public static void main(String[] args) {
// Aqui llamo a print�
		int c = 6;
		a = 5;
		print("Mundo"); // Llamando
		print("Mundo", c); // Llamando
	}
}
