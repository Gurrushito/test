package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		double num=0, cifra=0;
		int cifra0=0, cifra1=0, cifra2=0, cifra3=0, cifra4=0, cifra5=0, cifra6=0, cifra7=0, cifra8=0, cifra9=0;
		
		//INICIO
		
		System.out.println("introduzca un numero");
		num=Entrada.real();
		
		while (num>=1) {
			cifra=num%10;
			num=num/10;
			switch ((int)cifra) {
			case 0:
				cifra0++;
			break;
			case 1:
				cifra1++;
			break;
			case 2:
				cifra2++;
			break;
			case 3:
				cifra3++;
			break;
			case 4:
				cifra4++;
			break;
			case 5:
				cifra5++;
			break;
			case 6:
				cifra6++;
			break;
			case 7:
				cifra7++;
			break;
			case 8:
				cifra8++;
			break;
			case 9:
				cifra9++;
			break;
				
					
			}
		}
		System.out.println("El numero "+num+" tiene: \nCifras 0 hay: "+cifra0+" \nCifras 1 hay: "+cifra1+" \nCifras 2 hay: "+cifra2+" \nCifras 3 hay: "+cifra3+" \nCifras 4 hay: "+cifra4+" \nCifras 5 hay: "+cifra5+" \nCifras 6 hay: "+cifra6+" \nCifras 7 hay: "+cifra7+" \nCifras 8 hay: "+cifra8+" \nCifras 9 hay: "+cifra9);
		
	}
}
