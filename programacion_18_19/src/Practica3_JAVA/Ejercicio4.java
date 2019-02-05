package Practica3_JAVA;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int i=0, j=0, num=0;
		
		//INICIO
		
		System.out.println("introduzca un numero impar mayor o igual a 5:");
		num=Entrada.entero();
		while (num%2==0 || num<5) {
			System.out.println("introduzca un numero impar mayor o igual a 5:");
			num=Entrada.entero();
		}
		for (i=1; i<=num; i++) {
			for (j=1; j<=num; j++) {
				if (i==1 || i==(num/2)+1|| i==num || i==num-j+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

