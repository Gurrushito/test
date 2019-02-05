package ejercicios_Ampliacion;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		char caracIntroducido=' ';
		
		//INICIO
		
		System.out.println("Introduzca un caracter en minuscula");
		caracIntroducido=Entrada.caracter();
		
		caracIntroducido=(char)(int)(caracIntroducido-32);
		
		System.out.println(caracIntroducido);

	}
}
