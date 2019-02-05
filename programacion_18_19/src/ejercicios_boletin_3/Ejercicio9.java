package ejercicios_boletin_3;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0, i=0, suma=0, media=0;
		// INICIO
		System.out.println("Introduzca un numero");
		num=Entrada.entero();
		
		while (num>=0) {
			suma=suma+num;
			i++;
			System.out.println("Introduzca un numero");
			num=Entrada.entero();
		}
		media=suma/i;
		
		System.out.println("la media de tus numero es: "+media);
		
	}

}
