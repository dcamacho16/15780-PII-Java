package seleccion_e_iteracion_04;

public class EcuacionCuadratica {
	public static void main(String args[])
  { Random random = new Random();
	float a = random.nextFloat();


	double d = b*b - 4*a*c;
	boolean linear = (a == 0);
	boolean constant = (linear && b == 0);
	// Opciones de ecuaci�n de primer orden
	boolean trivial = ( );
	boolean noSolution = (constant && c!=0); 
	boolean unique = ( );
	// Opciones de ecuaci�n de segundo orden
	boolean quadratic = (!linear);
	boolean complex = ( );
	boolean equal = ( );
	boolean distinct = ( );
	System.out.println("Los coeficientes de la funcion f(x) = a*x^2 + b*x + c son:");
	System.out.println("\ta = " + a);
	System.out.println("\tb = " + b);
	System.out.println("\tc = " + c);
	System.out.print("La ecuacion f(x) = 0 is ");
	if (linear) System.out.print("linear ");
	if (trivial) System.out.print("y trivial.");
	if (noSolution) System.out.println("sin solucion.");
	if (unique)
	{ 	double x = -c/b;
		double y = a*x*x + b*x + c;
		System.out.println("con soluci�n �nica x="+x);
		System.out.println("Comprobamos f(x)="+y);
	}
	if (quadratic) System.out.print("cuadratica ");
	if (complex)
	{ 	double re = 
		double im = Math.sqrt(-d)/(2*a);
		System.out.println(
	}
	if (equal)
	{ 	double x = 
		double y = 
		System.out.println("con solucion real x = " + x);
		System.out.println("Comprobamos: f(x) = " + y);
	}

	if (distinct)
	{ 	double s = Math.sqrt(d);
		double x1 = 
		double x2 = 
		double y1 = 
		double y2 = 
		System.out.println("con soluciones reales:\n\tx1 = " + x1 + "\n\tx2 = " + x2);
		System.out.println("Comprobamos:\tf(x1) = " + y1 +  );
	}
  }
}