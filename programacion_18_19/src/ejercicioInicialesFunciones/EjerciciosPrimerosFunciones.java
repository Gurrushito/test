package ejercicioInicialesFunciones;

import ejemploJava.Entrada;

public class EjerciciosPrimerosFunciones {
	
	static double PI=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, numA=0, numB=0, n1=0, n2=0, n3=0, numEnt1=0, numEnt2=0, numDoble=0, Area=0, Volumen=0, numPrimo=0, cuentaDivisores=0, numcomun1=0, numcomun2=0, numcomun3=0, mcd=1, mcm=1;
		boolean esPrimo=true;
		
		//MODULO NUMERO
		/*num1=pideNumero();
		
		BucleModulo(numA);*/
		
		//NUMERO MAYOR/MENOR
		/*numA=pideNumero();
		numB=pideNumero();
		
		mayorMenor(numA, numB);*/
		
		//NUMERO MAYOR/MENOR (3 NUMERO)
		/*n1=pideNumero();
		n2=pideNumero();
		n3=pideNumero();
		
		mayorMenorTresNumeros(n1, n2, n3);*/
		
		//NUMEROS ENTEROS
		/*numEnt1=pideNumero();
		numEnt2=pideNumero();
		
		numerosComprendidosEntreEllos(numEnt1, numEnt2);*/
		
		//FUNCION DOBLE
		/*numDoble=pideNumero();
		numDoble=numeroDoble(numDoble);*/
		
		//AREA Y VOLUMEN
		
		/*Area=(int) areaCilindro(Area);
		Volumen=(int) volumenCilindro(Volumen);*/
		
		//PRIMO
		/*numPrimo=pideNumero();
		
		esPrimo=(boolean)numeroPrimo(numPrimo, esPrimo);*/
		
		//MODULO NUM PRIMOS
		/*numPrimo=pideNumero();
		
		cuentaDivisores=moduloDivisores(numPrimo, cuentaDivisores);*/
		
		//MAXIMO COMUN DIVISOR
		/*numcomun1=pideNumero();
		numcomun2=pideNumero();
		numcomun3=pideNumero();
		
		maximoComunDivisor(numcomun1, numcomun2, numcomun3, mcd);*/
		
		//MINIMO COMUN MULTIPLO
		numcomun1=pideNumero();
		numcomun2=pideNumero();
		numcomun3=pideNumero();
		
		
	}
	
	public static int pideNumero(){
		int num=0;
		System.out.println("Introduce un número: ");
		num=Entrada.entero();
		
		return num;
	}
	
	public static void bucleModulo(int a)
	{
		int i=0;
		
		while (i<a) {
			System.out.println("Módulo ejecutandose");
		i++;
		}
		
	}
	
	public static void mayorMenor(int a, int b) {
		if (a>b) {
			System.out.println("El numero "+a+" es mayor que el numero "+b);
		}
		else {
			System.out.println("El numero "+b+" es mayor que el numero "+a);
		}
	}
	
	public static void mayorMenorTresNumeros(int na, int nb, int nc) {
		if (na>nb && na>nc) {
			System.out.println("El numero "+na+" es mayor que el numero "+nb+" y que el numero "+nc);
		}
		else {
			if(nb>na && nb>nc) {
				System.out.println("El numero "+nb+" es mayor que el numero "+na+" y que el numero "+nc);
			}
			else {
				System.out.println("El numero "+nc+" es mayor que el numero "+na+" y que el numero "+nb);
			}
		}
	}
	
	public static void numerosComprendidosEntreEllos(int numEnt1, int numEnt2) {
		while (numEnt1<=numEnt2) {
			System.out.println(numEnt1);
			numEnt1++;
		}
	}
	
	public static int numeroDoble(int numD) {
		numD=numD*2;
		
		return numD;
	}
	
	public static double areaCilindro (double area) {
		double radio=0.0, altura=0.0;
		
		System.out.println("Introduce un radio");
		radio=Entrada.real;
		System.out.println("Introduce una altura");
		altura=Entrada.real;
		
		area=2*PI*radio*(altura+radio);
		
		return area;
	}
	public static double volumenCilindro (double volumen) {
		double radio=0.0, altura=0.0;
		
		System.out.println("Introduce un radio");
		radio=Entrada.real;
		System.out.println("Introduce una altura");
		altura=Entrada.real;
		
		volumen=PI*Math.pow(radio, 2)+altura;
		
		return volumen;
	}
	
	public static boolean numeroPrimo (int nPrimo, boolean esprimo) {
	int i=2;
	
	while (i<=(nPrimo/2) && nPrimo%i!=0) {
		i++;
	}
	if (i>nPrimo/2) {
		esprimo=true;
	}
	else {
		esprimo=false;
	}
	
	return esprimo;
	}
	
	public static int moduloDivisores (int nPrimo, int CuentaDivisores) {
		int i=2, div=2;
		
		while (div<=nPrimo) {
			if(nPrimo%div==0) {
				while ((i<=(nPrimo/2) && nPrimo%i!=0)) {
					i++;
				}
				if (i>nPrimo/2) {
					CuentaDivisores++;
				}
				i=2;
			}
			div++;
		}
		
	return CuentaDivisores;
	}
	
	public static void maximoComunDivisor (int nc1, int nc2, int nc3, int mcd) {
		int i=2;
		while (i<=nc1 && i<=nc2 && i<=nc3) {
			while (nc1%i==0 && nc2%i==0 && nc3%i==0) {
				mcd=mcd*i;
				nc1=nc1/i;
				nc2=nc2/i;
				nc3=nc3/i;
			}
		i++;
		}
		System.out.println("El maximo comun divisor de los numeros es: "+mcd);
	}
}
