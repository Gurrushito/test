package ejercicios_boletin_3;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int num = 0, i = 1, sumanegativo = 0, media = 0, contcero=0, sumapositivo=0;
		// INICIO

		while (i <= 10) {
			System.out.println("Introduzca un numero");
			num = Entrada.entero();
			if (num > 0) {
				sumapositivo = sumapositivo + num;
			}
			if (num<0) {
				sumanegativo=sumanegativo+num;
				media=sumanegativo/i;
			}
			if (num==0) {
				contcero++;
			}
			i++;
		}
		System.out.println("La suma de los numero positivos es; "+sumapositivo);
		System.out.println("La media de los numero negativo es; "+media);
		System.out.println("Has introducido "+contcero+" ceros");

	}

}
