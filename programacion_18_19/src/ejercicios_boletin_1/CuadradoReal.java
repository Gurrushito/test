package ejercicios_boletin_1;

public class CuadradoReal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		double numA=0.0, cuadrado=0.0;
		//INICIO
		System.out.println("Introduzca un numero REAL");
		numA=Entrada.real();
		cuadrado=Math.pow(numA, 2);
		System.out.println(""+numA+" al cuadrado es: "+cuadrado);
	
	}

}
