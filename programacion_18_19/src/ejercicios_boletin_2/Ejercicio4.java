package ejercicios_boletin_2;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int numA = 0, numB = 0, resto=0;
		// INICIO
		System.out.println("Introduzca un numero entero");
		numA = Entrada.entero();
		System.out.println("Introduzca un numero entero");
		numB = Entrada.entero();
		if (numA == numB ) {
			System.out.println("Ambos numero son iguales, por lo que son multiplos");
		} else {
			resto=numA%numB;
			if (resto==0) {
				System.out.println("El numero " + numA + " es multiplo de " + numB);
			} else {
				System.out.println("El numero " + numA + " no es multiplo de " + numB);
			}
			resto=numB%numA;
			if (resto==0) {
				System.out.println("El numero " + numB + " es multiplo de " + numA);
			} else {
				System.out.println("El numero " + numB + " no es multiplo de " + numA);
			}
		}
	}

}
