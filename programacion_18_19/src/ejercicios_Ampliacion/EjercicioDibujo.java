package ejercicios_Ampliacion;

import Practica3_JAVA.Entrada;

public class EjercicioDibujo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int num=0, j=0, i=0;
		
		//INICIO
		
		System.out.println("introduzca un numero impar mayor o igual a 5:");
		num=Entrada.entero();
		for (i=1; i<=num; i++) {
			for (j=1; j<=num; j++) {
				if (i==1 || i==(num/2)+1|| i==num || i==num-j+1 || j==num || j==(num/2)+1 || j==1 || i==j) {
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
