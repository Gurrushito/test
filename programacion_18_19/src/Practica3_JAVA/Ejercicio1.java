package Practica3_JAVA;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numCifras=0, numFinal=0, i=0, cifranumerica=0;
		String cifra=" ", cifranterior=" ";
		
		//INICIO
		
		System.out.println("¿De cuantas cifras quieres construir el numero?");
		numCifras=Entrada.entero();
		
		while (i<=numCifras) {
			System.out.println("introduzca una cifra en formato cadena");
			cifra=Entrada.cadena().toUpperCase();
				switch (cifra) {
				case "UNO":
					cifranumerica=1;
					break;
				case "DOS":
					cifranumerica=2;
					break;
				case "TRES":
					cifranumerica=3;
					break;
				case "CUATRO":
					cifranumerica=4;
					break;
				case "CINCO":
					cifranumerica=5;
					break;
				case "SEIS":
					cifranumerica=6;
					break;
				case "SIETE":
					cifranumerica=7;
					break;
				case "OCHO":
					cifranumerica=8;
					break;
				case "NUEVE":
					cifranumerica=9;
					break;
				}
				if (cifra.compareTo(cifranterior)>=0) {
					numFinal=numFinal+(cifranumerica*((int)Math.pow(10, i)));
					System.out.println("Cifra valida porque el numero introducido es menor o igual que el anterior");
					System.out.println("Su numero parcialmente es: "+numFinal);
					cifranterior=cifra;
					i++;
				}
				else {
					System.out.println("Cifra NO valida porque el numero introducido es mayor que el anterior");
					System.out.println("Su numero parcialmente es: "+numFinal);
				}
		}
		
	}
}
