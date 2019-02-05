package ejercicios_boletin_2;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		double num=0.0;
		//INICIO
		System.out.println("Introduzca un numero REAL");
		num=Entrada.real();
		if (num>0) {
			System.out.println("El numero es positivo");
		}
		else {
			if (num==0) {
				System.out.println("El numero es cero");
			}
			else {
				System.out.println("El numero es negativo");
			}
		}
	
	}

}
