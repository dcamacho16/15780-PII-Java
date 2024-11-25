package métodos_05;

public class Fibonacci {
	static int numveces;
	public static void main(String[] args) {
		System.out.println("La secuencia de Fibonacci es ");
		for (int i = 0; i < 10; i++) {
			numveces = 0;
			System.out.println(">>>>> Posición: " + i + "\t Valor: " + fib(i) + "\t Número de llamadas " + numveces);
		}
	}

	static long fib(int n) {
		numveces++;
		if (n < 2)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}
