package vectores;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int [] vectorAleatorio=new int [10];
		int cuentaPar=0, cuentaImpar=0;
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			vectorAleatorio[i]=(int)(Math.random()*20+1);
			if (vectorAleatorio[i]%2==0) {
				cuentaPar++;
			}
			else
				cuentaImpar++;
		}
		
		System.out.println("Hay "+cuentaPar+" numeros pares y "+cuentaImpar+" numeros impares");
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorAleatorio[i]);
		}
				
		
	}

}
