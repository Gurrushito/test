package Practica3_JAVA;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int i=1, j=1, num1=0, num2=0, k=2;
		
		//INICIO
		
		System.out.println("introduzca hasta que numero quiere mostrar las tablas de multiplicar");
		num1=Entrada.entero();
		System.out.println("introduzca hasta que numero quiere llegar a multiplicar lo numeros");
		num2=Entrada.entero();
		
		
		
		for (i=1; i<=num1; i++) {
			for (j=1; j<=num2; j++) {
				while ((k<=(j/2)) && (j%k!=0)) {
					k++;
				}
				if (k>(j/2)) {
					if((i*j)<10) {
						System.out.print(j+"*"+i+" = "+i*j+"  \t");
					}
					if((i*j)>=10 && ((i*j)<100)) {
						System.out.print(j+"*"+i+" = "+i*j+" \t");
					}
					if((i*j)>=100) {
						System.out.print(j+"*"+i+" = "+i*j+"\t");
					}
				}
			 }
		System.out.println();
		k=2;
		}
		
	}

}
