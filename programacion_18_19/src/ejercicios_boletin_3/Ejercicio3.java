package ejercicios_boletin_3;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num=0, cuentaPares=0;
		// INICIO
		
		while (cuentaPares<=20) {
			if (num%2==0) { //si entra, numero es par
				System.out.println("Número par: "+num);
				cuentaPares++;
			}
			num++;
		}
		
	}

}
