package seleccion_e_iteracion_04;

import java.util.Random;
public class Ejemplo0408
{ public static void main(String[] args)
  { Random random = new Random();
    int n = random.nextInt();
    System.out.println("n = " + n);
    n %= 3;
    n += 2;
    System.out.println("n = " + n);
    switch (n)
    { case 0: System.out.println("Este es el caso 0.");
      case 1: System.out.println("Este es el caso 1.");
      case 2: System.out.println("Este es el caso 2.");
      case 3: System.out.println("Este es el caso 3.");
      default: System.out.println("Este es el caso por defecto.");
    }
  }
}
