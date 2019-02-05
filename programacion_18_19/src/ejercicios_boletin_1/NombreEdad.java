package ejercicios_boletin_1;

public class NombreEdad {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		String nombre=" ";
		int edad=0;
		//INICIO
		System.out.println("Introduzca su nombre");
		nombre=Entrada.cadena();
		System.out.println("Introduzca su edad");
		edad=Entrada.entero();
		System.out.println("Hola "+nombre+", tienes "+edad+" años ¡Que mayor eres!");
		
	}

}
