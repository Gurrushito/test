package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTES
		final int DIA=21, MES=11, ANIO=2014;
		//VARIABLES
		int diaNacimiento=0, mesNacimiento=0, anioNacimiento=0, cuentaAnios=0;
		String mesCad=" ";
		
		//INICIO
		
		System.out.println("Introduzca tu fecha de nacimiento");
		diaNacimiento=Entrada.entero();	
		mesCad=Entrada.cadena();	
		anioNacimiento=Entrada.entero();
		
		switch (mesCad) {
			case "ENERO":
			mesNacimiento=1;
			break;
			case "FEBERO":
			mesNacimiento=2;
			break;
			case "MARZO":
			mesNacimiento=3;
			break;
			case "ABRIL":
			mesNacimiento=4;
			break;
			case "MAYO":
			mesNacimiento=5;
			break;
			case "JUNIO":
			mesNacimiento=6;
			break;
			case "JULIO":
			mesNacimiento=7;
			break;
			case "AGOSTO":
			mesNacimiento=8;
			break;
			case "SEPTIEMBRE":
			mesNacimiento=9;
			break;
			case "OCTUBRE":
			mesNacimiento=10;
			break;
			case "NOVIEBRE":
			mesNacimiento=11;
			break;
			case "DICIEMBRE":
			mesNacimiento=12;
			break;
			
		}
		
		while (anioNacimiento<ANIO) {
			cuentaAnios++;
			anioNacimiento++;
		}
		if (mesNacimiento<MES) {
			cuentaAnios--;
		}
		if (diaNacimiento<DIA) {
			cuentaAnios--;
		}
		else {
			cuentaAnios++;
		}
		
		System.out.println("El usuario tiene "+cuentaAnios+" años");
	}
}
