package ejercicios_boletin_3;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTES
		final int SUMA_HASTA=20;
		// VARIABLES
		int acumulador=0, i=0;
		// INICIO
		
		while (i<=SUMA_HASTA) {
			acumulador=acumulador+i;
			i++;
		}
		System.out.println("La suma de los números desde el 1 hasta el "+SUMA_HASTA+" es: "+acumulador);
		
	}

}
