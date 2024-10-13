package seleccion_e_iteracion_04;

import java.util.Random;
public class Ejemplo0409
{ public static void main(String args[])
  { Random random = new Random();
    float x = random.nextFloat();
    System.out.println("x = " + x);
    int score = Math.round(10*x);
    System.out.println("El resultado de tu examen es = " + score);
    switch (score)
    { case 10:
      case 9:
        System.out.println("Has obtenido un sobresaliente!");
        break;
      case 8:
      case 7:
        System.out.println("Tu nota es un notable!");
        break;
      case 6:
      case 5:
        System.out.println("Calificacion: suficiente.");
        break;
      default:
        System.out.println("Proxima convocatoria...");
    }
  }
}


