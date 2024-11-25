package clases_06;

import java.text.*;

public class Circle {
	private Point p0; // un punto de la lrculo
	static DecimalFormat df = new DecimalFormat("0.00");

	public Circle(Point p, double s) {
// p0 = new Point(p); -> Instanciando un nuevo punto
		p0 = p; // -> Utilizando el mismo punto
		r = s;
	}

	public Circle(Circle c) {
		p0 = new Point(c.p0);
//p0 = c.p0; // -> Utilizando el mismo punto
		r = c.r;
	}

	public double longitud() {
		return 2 * Math.PI * r;
	}

	public double area() {
		return Math.PI * r * r;
	}

	public boolean equals(Circle c) {
// return (p0 == c.p0 && r == c.r); // Puede fallar
		return (p0.x() == c.p0.x() && p0.y() == c.p0.y() && r == c.r);
	}

public String toString()
{
// return new String("{c=" + p0.str() + ",r=" +
df.format(r) +"}");
return new String("{c=" + p0.str() + ",r=" + r +"}");
}

	public static void main(String args[]) {
		Point p1 = new Point(5, -4);
		Circle circulo1 = new Circle(p1, 3.2);
		System.out.println("De momento tenemos una " + circulo1 + " cuya area es " + df.format(circulo1.area())
				+ " y longitud es " + df.format(circulo1.longitud()) + "\n");
		Point p2 = new Point(5, -4);
		float diametro = (float) (6.4);
		Circle circulo2 = new Circle(p2, diametro / 2);
		System.out.print("Y ahora tenemos una " + circulo2 + ".");
		if (circulo2.equals(circulo1))
			System.out.println("La 1 y la 2 son iguales. \n");
		else
			System.out.println("Las circunferencias 1 y 2 no son iguales. \n");
		Circle circulo3 = new Circle(circulo1);
		if (circulo3 == circulo1)
			System.out.println("Circulo 1 y 3 son iguales");
		else
			System.out.println("Circulo 1 y 3 son distintos");
		if (circulo3.equals(circulo1))
			System.out.println("La 1 y la 3 son iguales.");
		else
			System.out.println("Las circunferencias 1 y 3 no son iguales.");
	}
}