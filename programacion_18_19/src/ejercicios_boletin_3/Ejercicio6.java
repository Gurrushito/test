package ejercicios_boletin_3;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTES
		final int NUM_TOPE=20;
		// VARIABLES
		int sumaPares=0, i=2, multiplicaimpares=1;
		// INICIO
		
		while (i<=NUM_TOPE) {
			sumaPares=sumaPares+i;
			i=i+2;
		}
		System.out.println("La suma de los numeros PARES desde el 1 hasta "+NUM_TOPE+" es: "+sumaPares);
		
		i=1;
		
		while (i<=NUM_TOPE) {
			multiplicaimpares=multiplicaimpares+i;
			i=i+2;
		}
		System.out.println("La multiplicacion de los numeros IMPARES desde el 1 hasta "+NUM_TOPE+" es: "+multiplicaimpares);
	}

}
