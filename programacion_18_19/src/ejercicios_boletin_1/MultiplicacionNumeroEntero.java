package ejercicios_boletin_1;

public class MultiplicacionNumeroEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numA=0, mult=0;
		//INICIO
		System.out.println("Introduzca un numero");
		numA=Entrada.entero();
		mult=numA*2;
		System.out.println("La multiplicacion de "+numA+" por 2 es: "+mult);
		mult=numA*3;
		System.out.println("La multiplicacion de "+numA+" por 3 es: "+mult);
	}

}
