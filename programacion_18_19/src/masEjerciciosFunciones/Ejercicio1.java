package masEjerciciosFunciones;

public class Ejercicio1 {
	
	static double PI=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String AreaQueDesea=" ";
		double areaCu=0, areaRe=0, areaTri=0, areaCir=0;
		
		System.out.println("Introduzca un area que quiera calcular");
		AreaQueDesea=Entrada.cadena();
		
		switch (AreaQueDesea) {
			case "Area Cuadrado":
				calculaAreaCuadrado(areaCu);
			break;
			case "Area Rectangulo":
				calculaAreaRectangulo(areaRe);
			break;
			case "Area Triangulo":
				calculaAreaTriangulo(areaTri);
			break;
			case "Area Circulo":
				calculaAreaCirculo(areaCir);
			break;
			default: 
				System.out.println("Tio, introduce un area COMPARÉ!!");
		}
		
	}

	
	public static void calculaAreaCuadrado(double AreaCuadrado) {
		double lado=0.0, areaC=0.0;
		
		System.out.println("Introduzca cuanto mide un lado");
		lado=Entrada.real();
		
		areaC=(double) Math.pow(lado, lado);
		
		System.out.println("El area del Cuadrado es "+areaC);
	}
	
	public static void calculaAreaRectangulo(double AreaRectangulo) {
		double base=0.0, altura=0.0, areaR=0.0;
		
		System.out.println("Introduzca la base");
		base=Entrada.real();
		System.out.println("Introduzca la altura");
		altura=Entrada.real();
		
		areaR=base*altura;
		
		System.out.println("El area del Rectangulo es "+areaR);
	}
	
	public static void calculaAreaTriangulo(double AreaTriangulo) {
		double base=0.0, altura=0.0, areaT=0.0;
		
		System.out.println("Introduzca la base");
		base=Entrada.real();
		System.out.println("Introduzca la altura");
		altura=Entrada.real();
		
		areaT=(base*altura)/2;
		
		System.out.println("El area del Rectangulo es "+areaT);
	}
	
	public static void calculaAreaCirculo(double AreaCirculo) {
		double radio=0.0, areaC=0.0;
		
		System.out.println("Introduzca el radio");
		radio=Entrada.real();
		
		areaC=(double)(PI*Math.pow(radio, radio));
		
		System.out.println("El area del Rectangulo es "+areaC);
	}
	
}
