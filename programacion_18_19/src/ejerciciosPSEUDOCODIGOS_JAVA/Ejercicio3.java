package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTES
		final int CIFRANUM=3;
		//VARIABLES
		int num=0, cifra1=0, cifra2=0, cifra3=0, cifraElevada1=1, cifraElevada2=1, cifraElevada3=1, i=1;
		
		//INICIO
		
		System.out.println("Introduzca un numero de 3 cifras");
		num=Entrada.entero();
		
		//Calculo el numero de cada cifra del numero
		
		//para la primera cifra
		cifra1=num/100;
		//para la segunda cifra
		cifra2=num%100;
		cifra2=cifra2/10;
		//para la tercera cifra
		cifra3=num%10;
		
		while (i<=CIFRANUM) {
			cifraElevada1=cifraElevada1*cifra1;
			cifraElevada2=cifraElevada2*cifra2;
			cifraElevada3=cifraElevada3*cifra3;
			i++;
		}
		if (num==cifraElevada1+cifraElevada2+cifraElevada3) {
			System.out.println("El numero es un numero Amstromg");
		}
		else {
			System.out.println("El numero no es un numero Amstrong");
		}

	}
}
