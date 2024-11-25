package arrays_07;

//Leer las longitudes de audio1, audio2, y audio3
	//Calcular la longitud maxima de los 3: longmax (Math.max)
	//Crear 4 vectores short[] de longitud longmax: audio1max, audio2max, audio3max, salida
	//Copiar audio1 en audio1aux (lo mismocon audio2 y audio3)
	//Bucle desde 0 hasta longmax-1
	//dentro del bucle la operacion muestra
	// Devolver salida (return salida)
public class MezclaSonora {
	//static short[] mezclador(short[] audio1, float ganancia1, short[] audio2, float ganancia2, short[] audio3, float ganancia3) 
	// Determinamos la longitud del array con más componentes
	//int longtotal[] = Math.max

	static void print(short[] u, String id)
		  { for (int i=0; i<u.length; i++) {
			  //salida[i]=(audio1[i]·ganancia1+ audio2[i]·ganancia2+audio3[i]·ganancia3)/(ganancia1+ganancia2+ganancia3)
		    System.out.print(u[i]);
		  }
		}

	public static void main(String args[]) {
		short[] a1 = { 1, 2, 3, 4, 5, 6 };
		print(a1, "a1");
		short[] a2 = { 10, 10, 10, 10, 10, 10, 10, 10 };
		print(a2, "a2");
		short[] a3 = { 100, 100, 100 };
		print(a3, "a3");
		//short[] mezcla;
		/*mezcla = mezclador(a1, 1, a2, 1, a3, 0);
		print(mezcla, " mezcla (a1+a2)/2 ");
		mezcla = mezclador(a1, 2, a2, 1, a3, 0);
		print(mezcla, " mezcla (2*a1+a2)/3 ");
		mezcla = mezclador(a1, (float) 2.4, a2, (float) 3.2, a3, (float) 0.27);
		print(mezcla, " mezcla (2.4*a1+3.2*a2+0.27*a3)/5.87 ");*/
	}
}