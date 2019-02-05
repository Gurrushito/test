package vectores;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		int [] vectorPositivos=new int [10];
		int sumaPar=0, sumaImpar=0;
		
		for(int i=0;i<vectorPositivos.length;i++) {
			System.out.println("Introduce en la posicion "+i+" numeros del 1 al 20");
			vectorPositivos[i]=Entrada.entero();
		}
		
		for(int i=0;i<vectorPositivos.length;i++) {
			if (vectorPositivos[i]%2==0) {
				sumaPar=sumaPar+vectorPositivos[i];
			}
			else {
				sumaImpar=sumaImpar+vectorPositivos[i];
			}
		}
		System.out.println("La suma de los numeros pares del vector es: "+sumaPar);
		System.out.println("La suma de los numeros impares del vector es: "+sumaImpar);
	}

}
