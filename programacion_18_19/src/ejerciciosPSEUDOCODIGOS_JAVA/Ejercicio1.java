package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numA=0, numB=0, i=2, j=2;
		
		//INICIO
		
		System.out.println("Introduzca un numero, el primero tiene que ser mas pequeño");
		numA=Entrada.entero();
		System.out.println("Introduzca otro numero");
		numB=Entrada.entero();
		
		while ((1<=(numA/2) && numA%i!=0)) {
			i++;
		}
		while ((1<=(numB/2) && numB%j!=0)) {
			j++;
		}
		
		
		if (numA+2==numB) {
			if ((i>numA/2) && (j>numB/2))  {
				System.out.println("Los numeros son primos gemelos");
			}
			else {
				System.out.println("los numero primos no son gemelos");
			}
			
		}
		else {
			System.out.println("los numero primos no son gemelos");
		}
		
		
	}

}
