package clases_06;

public class Point { // Una instancia que representa un punto en el plano cartesiano
	private double x, y;

	public Point(double a, double b) {
		x = a;
		y = b;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public void move(double a, double b) {
		x = a;
		y = b;
	}

	public void shift(double h, double k) {
		x += h;
// if (x>1080) x=1080;
// if (x<1080) x=0;
		y += k;
	}

	public String str() {
		return new String("(" + x + ", " + y + ")");
	}

	public static void main(String args[]) {
		Point p = new Point(2, 3);
		System.out.println("El punto p es ahora " + p.str());
		System.out.println("Su coordenada x es " + p.x() + ", y su coordenada y es " + p.y());
		p.shift(5, -2);
		System.out.println("El punto p es ahora " + p.str());
		p.move(5, -2);
		System.out.println("El punto p es ahora " + p.str());
		Point q = new Point(p);
		System.out.println("p = " + p.str() + " and q = " + q.str());
		q.shift(10, 10);
		System.out.println("p = " + p.str() + " and q = " + q.str());
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
