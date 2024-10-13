package seleccion_e_iteracion_04;

import java.util.Random;
public class Ejemplo0413
{ 
  public static void main(String[] args)
  { 
    Random random = new Random();
    float x = random.nextFloat();
    System.out.println("x = " + x);
    int n = (int)Math.floor(101*x);
    boolean isNotPrime = (n < 2);
    for (int d = 2; d < n; d++) //Le puedo agregar d=d+2 para agilizar contador y ahorrar tiempo avanzando de par en par
    { isNotPrime = (n%d == 0);
      if (isNotPrime) break;
    } 
    if (isNotPrime) System.out.println(n + " no es primo.");
    else System.out.println(n + " es primo.");
  }
}
