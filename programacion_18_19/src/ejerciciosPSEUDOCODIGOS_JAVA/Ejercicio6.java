package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int dia=0, mes=0, cuentaDias=0, i=0;
		
		//INICIO
		
		System.out.println("Introduzca un dia");
		dia=Entrada.entero();
		System.out.println("Introduzca un mes en formato numerico");
		mes=Entrada.entero();
		
		while (i<mes) {
		if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
			cuentaDias=cuentaDias+31;
		}
		else {
			if (i==4 || i==6 || i==9 || i==11) {
				cuentaDias=cuentaDias+30;
			}
			else {//mes==2
					cuentaDias=cuentaDias+28;
				}
			}
		i++;
		}
		
		cuentaDias=cuentaDias+dia;
		
		if ((cuentaDias-1)%7==0) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: LUNES");
		}
		if ((cuentaDias-1)%7==1) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: MARTES");
		}
		if ((cuentaDias-1)%7==2) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: MIERCOLES");
		}
		if ((cuentaDias-1)%7==3) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: JUEVES");
		}
		if ((cuentaDias-1)%7==4) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: VIERNES");
		}
		if ((cuentaDias-1)%7==5) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: SABADO");
		}
		if ((cuentaDias-1)%7==6) {
			System.out.println("El dia "+dia+" del mes "+mes+" es: DOMINGO");
		}
	}

}
