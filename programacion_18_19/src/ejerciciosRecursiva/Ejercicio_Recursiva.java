package ejerciciosRecursiva;

import practicaIVJAVASubprogramas.Entrada;

public class Ejercicio_Recursiva {
	
	public static void main(String[] args) {
		
	}
	
	public static int tablaDeMultiplicar(int num, int i) {
		int n2=1, mult=0, n=10;
		
		//caso base
		if(n==0)
			return 0;
		else//caso recursivo
		{
			return tablaDeMultiplicar(n2,n-1)+n2;
		}
	}
	
	public static int potencia(int base, int exponente) {
		int ba=1, potencia=0, exp=10;
		
		//caso base
		if(ba==0)
			return 0;
		else//caso recursivo
		{
			return potencia(ba^exp, exp-1);
		}
	}
	
	public static void imprimeCifrasNumero(int num) {
		//caso base
		if (num<10)
			System.out.println(" "+ num);
		//caso recursivo
		else {
			
		}
	}
}
