package seleccion_e_iteracion_04;
//##################EXAMEN################
import java.util.Random;

public class Contadorprimos {
	public static void main(String[] args) {
		//Random random = new Random();
		//float x = random.nextFloat();
		//System.out.println("x = " + x);
		//int n = (int) Math.floor(101 * x);

		String sout = "Los numeros primos son: 1, "
		for (int n=3; n<=1000; n+2=) {
			boolean isNotPrime = (n < 2);
			
			for (int d = 2; d < n; d++) {
				isNotPrime = (n % d == 0);
				if (isNotPrime)
					break;
			}
			if (!isNotPrime)
				sout = sout + n + ", ";
		}
		
	}
}
