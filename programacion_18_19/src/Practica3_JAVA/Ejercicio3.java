package Practica3_JAVA;

import ejerciciosPSEUDOCODIGOS_JAVA.Entrada;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTES
		int DIA=14, MES=11, ANIO=2018;
		//VARIABLES
		int diaNacimiento=0, mesNacimiento=0, anioNacimiento=0, cuentaDias=0, i=1, j=12, anioanterior=0, mesanterior=0, diaMes=0;
		
		//INICIO
		
		System.out.println("Introduzca su fecha de nacimiento");
		diaNacimiento=Entrada.entero();
		mesNacimiento=Entrada.entero();
		anioNacimiento=Entrada.entero();
		
		cuentaDias=cuentaDias+DIA;
		
		mesanterior=MES-1;
		
		while (i<=mesanterior) {
			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
				cuentaDias=cuentaDias+31;
			}
			else {
				if (i==4 || i==6 || i==9 || i==11) {
					cuentaDias=cuentaDias+30;
				}
				else {//mes==2
					if ((anioNacimiento%4==0) && ((anioNacimiento!=100) || (anioNacimiento%400==0))){
						cuentaDias=cuentaDias+29;
					}
					else {
						cuentaDias=cuentaDias+28;
					}
				}
			}
			i++;
			}
		
		anioanterior=ANIO-1;
		
			while (anioanterior>=(anioNacimiento+1)) {
				if ((anioanterior%4==0) && ((anioanterior!=100) || (anioanterior%400==0))){
					cuentaDias=cuentaDias+366;
				}
				else {
					cuentaDias=cuentaDias+365;
				}
			anioanterior--;
			}	
		
			while (j>mesNacimiento) {
				if (j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12) {
					cuentaDias=cuentaDias+31;
				}
				else {
					if (j==4 || j==6 || j==9 || j==11) {
						cuentaDias=cuentaDias+30;
					}
					else {
						cuentaDias=cuentaDias+28;
					}
				}
			j--;
			}
			
			
		if (j==mesNacimiento) {
			if (mesNacimiento==1 || mesNacimiento==3 || mesNacimiento==5 || mesNacimiento==7 || mesNacimiento==8 || mesNacimiento==10 || mesNacimiento==12) {
				diaMes=31-diaNacimiento;
				cuentaDias=cuentaDias+diaMes;
			}
			else {
				if (mesNacimiento==4 || mesNacimiento==6 || mesNacimiento==9 || mesNacimiento==11) {
					diaMes=30-diaNacimiento;
					cuentaDias=cuentaDias+diaMes;
				}
				else {
					diaMes=28-diaNacimiento;
					cuentaDias=cuentaDias+diaMes;
				}
			}
		}
		
		System.out.println("hay "+cuentaDias+" dias");
		
		if (cuentaDias%7==5) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un VIERNES");
		}
		if (cuentaDias%7==6) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un JUEVES");
		}
		if (cuentaDias%7==0) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un MIERCOLES");
		}
		if (cuentaDias%7==1) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un MARTES");
		}
		if (cuentaDias%7==2) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un LUNES");
		}
		if (cuentaDias%7==3) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un DOMINGO");
		}
		if (cuentaDias%7==4) {
			System.out.println("Sabiendo que el día "+DIA+" de "+MES+" de "+ANIO+" es MIERCOLES... \nUsted nació un SABADO");
		}

	}
}


// JUAN ANTONIO POR MUCHO QUE LO INTENTE NO PUDE CONSEGUIR SACAR LOS DIAS, ME QUEDAN SOLO 5 DE DIFERENCIA.

