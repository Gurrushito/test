package ejercicios_boletin_1;

public class NumeroElevado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numA=0;
		//INICIO
		System.out.println("Introduzca un numero entero");
		numA=Entrada.entero();
		System.out.println("El numero es: "+numA+"\nElevado a 2 es: "+(int)Math.pow(numA, 2)+"\nElevado a 3 es: "+(int)Math.pow(numA, 3));
		
	}
	

}
