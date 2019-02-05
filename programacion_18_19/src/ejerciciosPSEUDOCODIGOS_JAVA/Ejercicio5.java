package ejerciciosPSEUDOCODIGOS_JAVA;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLE
		int num=0;
		//INICIO
		
		System.out.println("introduzca un numero");
		num=Entrada.entero();
		
			for (int i=0; i<num; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
	}

}
