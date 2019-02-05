package ejercicios_boletin_3;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0, i=0;
		// INICIO
		
		while (num!=0) {
			System.out.println("Introduzca un numero entero");
			num=Entrada.entero();
			if (i%2==0) {
				System.out.println("El numero es par");
			}
			else {
				System.out.println("El numero es impar");
			}
			i++;
		}
		
	}

}
