package ejercicios_Ampliacion;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int dia=0, mes=0, anio=0;
		
		//INICIO
		
		System.out.println("introduzca una fecha");
		dia=Entrada.entero();
		mes=Entrada.entero();
		anio=Entrada.entero();
		
		dia++;
		
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 && dia>31) {
			dia=1;
			mes++;
		}
		else {
			if (mes==4 || mes==6 || mes==9 || mes==11 && dia>30) {
				dia=1;
				mes++;
			}
			else {
				if(mes==2) {
					if (((anio%4==0) && ((anio%100!=0 || (anio%400==0)) & dia>29))){
						dia=1;
						mes++;
					}
					else {
						dia=1;
						mes++;
					}
				}
			}
		}
		if (mes>12) {
			anio++;
			mes=1;
		}
		
		System.out.println(dia+"/"+mes+"/"+anio);
	}

}


