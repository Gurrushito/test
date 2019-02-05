package ejercicios_boletin_2;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0;
		// INICIO
		System.out.println("Introduzca un numero entre el 0 y el 9999");
		num= Entrada.entero();
		
		if (num>=0 && num<=9999) {
			if (num>=1000) {
				System.out.println("Tiene cuatro cifras");
			}
			else {
				if (num>=100) {
					System.out.println("Tiene tres cifras");
				}
				else {
					if (num>=10) {
						System.out.println("Tiene dos cifras");
					}
					else {
						System.out.println("Tiene una cifra");
					}
				}
			}
		}
		else {
			System.out.println("El numero no está entre 0 y 9999");
		}
	}

}
