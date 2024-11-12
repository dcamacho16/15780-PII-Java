package arrays_07;

public class MezclaSonora {
	
	

	public static void main(String args[]) {
		short[] a1 = { 1, 2, 3, 4, 5, 6 };
		print(a1, "a1");
		short[] a2 = { 10, 10, 10, 10, 10, 10, 10, 10 };
		print(a2, "a2");
		short[] a3 = { 100, 100, 100 };
		print(a3, "a3");
		short[] mezcla;
		mezcla = mezclador(a1, 1, a2, 1, a3, 0);
		print(mezcla, " mezcla (a1+a2)/2 ");
		mezcla = mezclador(a1, 2, a2, 1, a3, 0);
		print(mezcla, " mezcla (2*a1+a2)/3 ");
		mezcla = mezclador(a1, (float) 2.4, a2, (float) 3.2, a3, (float) 0.27);
		print(mezcla, " mezcla (2.4*a1+3.2*a2+0.27*a3)/5.87 ");
	}
}