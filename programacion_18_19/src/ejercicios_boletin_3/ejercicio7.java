package ejercicios_boletin_3;

public class ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0, suma=0;
		// INICIO
		
		while (num>=0) {
			suma=suma+num;
			System.out.println("Introduzca un numero");
			num=Entrada.entero();
		}
		System.out.println("La suma de los numeros introducidos es "+suma);
		
	}

}
