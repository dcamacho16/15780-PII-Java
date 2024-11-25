package lab_ch2;

import java.util.Scanner;

public class Calcular {

    // Método para calcular el valor de la función x(t)
    public static double calcularFuncion(double t, double a, int b, int c, double d) {
        return a * Math.pow(t, 3) + b * Math.pow(t, 2) + c * t + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los valores para a, b, c y d
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        int b = sc.nextInt();

        System.out.print("Introduce el valor de c: ");
        int c = sc.nextInt();

        System.out.print("Introduce el valor de d: ");
        double d = sc.nextDouble();
        sc.nextLine();  // Consumimos la nueva línea después de sc.nextDouble()

        // Pedimos el vector de tres datos
        System.out.print("Introduce el vector con los tres datos separados por dos espacios t=");
        String vector = sc.nextLine();  // Leemos toda la línea de entrada para el vector

        // Limpiamos los corchetes y los espacios innecesarios
        vector = vector.substring(1, vector.length() - 1); // Quitamos los corchetes
        String[] datos = vector.split("  "); // Dividimos por dos espacios

        // Convertimos los datos a valores numéricos
        double t1 = Double.parseDouble(datos[0]);
        double t2 = Double.parseDouble(datos[1]);
        double t3 = Double.parseDouble(datos[2]);

        // Calculamos la función para cada valor de t
        double resultado1 = calcularFuncion(t1, a, b, c, d);
        double resultado2 = calcularFuncion(t2, a, b, c, d);
        double resultado3 = calcularFuncion(t3, a, b, c, d);

        // Mostramos los resultados
        System.out.println("x(" + t1 + ")=" + a + "·(" + t1 + ")^3 + " + b + "·(" + t1 + ")^2 + " + c + "·(" + t1 + ") + " + d + "=" + resultado1);
        System.out.println("x(" + t2 + ")=" + a + "·(" + t2 + ")^3 + " + b + "·(" + t2 + ")^2 + " + c + "·(" + t2 + ") + " + d + "=" + resultado2);
        System.out.println("x(" + t3 + ")=" + a + "·(" + t3 + ")^3 + " + b + "·(" + t3 + ")^2 + " + c + "·(" + t3 + ") + " + d + "=" + resultado3);

        sc.close();
    }
}

