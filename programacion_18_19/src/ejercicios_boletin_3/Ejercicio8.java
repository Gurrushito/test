package ejercicios_boletin_3;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0, contpositivo=0;
		// INICIO
		System.out.println("Introduzca un numero");
		num=Entrada.entero();
		
		while (num>0) {
			contpositivo++;
			System.out.println("Introduzca otro numero");
			num=Entrada.entero();
		}
		System.out.println("Ha escrito un numero negativo o un 0");
		System.out.println("Ha escrito "+contpositivo+" numeros positivos");
		
	}

}
