package vectores;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		int [] vectorInicial=new int [10];
		int [] vectorPares;
		int [] vectorImpares;
		int posvectorPar=0, posvectorImpar=0;
		int contP=0, contI=0;
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Introduce en la posicion "+i+" numeros del 1 al 20");
			vectorInicial[i]=Entrada.entero();
		}
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i]%2==0) {
				contP++;
			}
			else
				contI++;
		}
		
		vectorPares=new int[contP];
		vectorImpares=new int[contI];
		
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i]%2==0) {
				vectorPares[posvectorPar]=vectorInicial[i];
				posvectorPar++;
			}
			else {
				vectorImpares[posvectorImpar]=vectorInicial[i];
				posvectorImpar++;
			}
		}
		System.out.println("En el Vector de pares los que aparecen son: ");
		for(int i=0;i<vectorPares.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorPares[i]);
		}
		System.out.println("En el Vector de impares los que aparecen son: ");
		for(int i=0;i<vectorImpares.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorImpares[i]);
		}
	}

}