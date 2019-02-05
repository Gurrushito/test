package ejercicios_boletin_2;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTE
		final double PI=3.1415;
		// VARIABLES
		double base=0, altura=0, radio=0, areaT=0, areaC=0;
		// INICIO
		System.out.println("Introduzca una base y altura del triángulo");
		base=Entrada.real();
		altura=Entrada.real();
		System.out.println("Introduzca el radio de un círculo");
		radio=Entrada.real();
		areaT=(base*altura)/2;
		areaC=PI*Math.pow(radio, 2);
		if (areaT>areaC) {
			System.out.println("El triangulo es mayor que el circulo");
		}
		if(areaT<areaC) {
			System.out.println("El circulo es mayor que el triangulo");
		}
		if(areaT==areaC) {
			System.out.println("Ambos tienen el mismo área");
		}

	}
}
