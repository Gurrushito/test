package ejercicios_boletin_2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numA=0, numB=0;
		//INICIO
		System.out.println("Introduzca un numero entero");
		numA=Entrada.entero();
		System.out.println("Introduzca un numero entero");
		numB=Entrada.entero();
		if (numA>numB) {
			System.out.println("El numero "+numA+" es mayor que el numero "+numB);
		}
		else {
			if (numA<numB) {
				System.out.println("El numero "+numB+" es mayor que el numero "+numA);
			}
			else {
				System.out.println("Los dos numeros son iguales");
			}
		}
	
	}

}
