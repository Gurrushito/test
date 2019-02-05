package ejercicios_boletin_1;

public class NumeroIncrementado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numero=0;
		//INICIO
		System.out.println("Introduzca un numero");
		numero=Entrada.entero();
		System.out.println("El nuemro introducido por el usuario es: "+numero);
		numero++;
		System.out.println("EL numero aumentado en uno es igual a "+numero);
		numero=numero+2;
		System.out.println("EL numero aumentado en dos es igual a "+numero);
		
	}

}
