package ejercicios_boletin_2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int numA = 0, numB = 0;
		// INICIO
		System.out.println("Introduzca un numero entero");
		numA = Entrada.entero();
		System.out.println("Introduzca un numero entero");
		numB = Entrada.entero();
		if (numA % numB == 0) {
			System.out.println("El numero " + numA + " es multiplo de " + numB);
		} else {
			System.out.println("El numero " + numA + " no es multiplo de " + numB);
		}
	}

}
