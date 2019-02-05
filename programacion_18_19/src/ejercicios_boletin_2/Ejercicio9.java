package ejercicios_boletin_2;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int numA=0, numB=0, numC=0;
		// INICIO
		System.out.println("Introduzca el PRIMER numero");
		numA= Entrada.entero();
		System.out.println("Introduzca el SEGUNDO numero");
		numB= Entrada.entero();
		System.out.println("Introduzca el TERCERO numero");
		numC= Entrada.entero();
		
		if (numA+numB==numC) {
			System.out.println("La suma de "+numA+" mas "+numB+" coincide con "+numC);
		}
		else {
			if (numB+numC==numA) {
				System.out.println("La suma de "+numB+" mas "+numC+" coincide con "+numA);
			}
			else {
				if (numA+numC==numB) {
					System.out.println("La suma de "+numA+" mas "+numC+" coincide con "+numB);
				}
				else {
					System.out.println("ningun resultado de la suma de dos valores coincide con el tercero");
				}
			}
		}
	}

}
