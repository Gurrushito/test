package ejercicios_boletin_1;

public class RadioCirculo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTANTE
		double PI=3.1415;
		//VARIABLES
		double radio=0.0,area=0.0,perimetro=0.0;
		//INICIO
		System.out.println("Introduzca un radio");
		radio=Entrada.real();
		area=PI*(radio*radio);
		System.out.println("El resuslatdo del área de un circulo de radio "+radio+" es: "+area);
		perimetro=(2*PI)*radio;
		System.out.println("El resultado del perimetro de un circulo de radio "+radio+" es: "+perimetro);
		
	}

}
