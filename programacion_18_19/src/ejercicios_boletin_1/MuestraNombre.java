package ejercicios_boletin_1;

public class MuestraNombre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		String nombre="",apellido1="",apellido2="";
		//INICIO
		System.out.println("Introduzca su nombre");
		nombre=Entrada.cadena();
		System.out.println("Introduzca su apellido");
		apellido1=Entrada.cadena();
		System.out.println("Introduzca su segundo apellido");
		apellido2=Entrada.cadena();
		System.out.println("Su nombre es "+nombre+" "+apellido1+" "+apellido2);
		
	}

}
