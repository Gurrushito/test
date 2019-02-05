package vectores;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int [] vectorNumeros=new int [10];
		int numeroMayor=0, pos=0;
		
		for(int i=0;i<vectorNumeros.length;i++) {
			vectorNumeros[i]=(int)(Math.random()*100+1);
		}
		for(int i=0;i<vectorNumeros.length;i++) {
			if (vectorNumeros[i]>=numeroMayor) {
				numeroMayor=vectorNumeros[i];
				pos=i;
			}
		}
		for(int i=0;i<vectorNumeros.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorNumeros[i]);
		}
	}

}
