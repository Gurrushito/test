package ejercicios_boletin_2;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		double nota=0;
		// INICIO
		System.out.println("Introduzca una nota");
		nota=Entrada.real();
		
		if (nota>=0 && nota<5) {
			System.out.println("INSUFICIENTE!");
		}
		if (nota>=5 && nota<6) {
			System.out.println("SUFICIENTE!");
		}
		if (nota>=6 && nota<7) {
			System.out.println("BIEN!");
		}
		if (nota>=7 && nota<9) {
			System.out.println("NOTABLE!");
		}
		if (nota>=9 && nota<10) {
			System.out.println("SOBRESALIENTE!");
		}
		if (nota<0 || nota>10) {
			System.out.println("NOTA NO VALIDA!");
		}
	}

}
