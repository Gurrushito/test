package matrices;

import vectores.Entrada;

public class Matrices {
	
	public static void main(String[] args) {
		int [][] matriz1=new int[3][3], matri= {{1,5,7,3},
											   {4,2,2,1},
											   {9,5,4,2},
											   {6,8,3,2}};
		int resultadoSuma=0;
		
		/*rellenaMatriz(matriz1);
		muestraMatriz(matriz1);
		resultadoSuma=sumaMatriz(matriz1);
		System.out.println("La suma de todos los valores de la matriz es: "+resultadoSuma);
		*/
		
		muestraMatriz(matri);
		esMatrizTriangular(matri);
	}
	
	public static void rellenaMatriz (int [][] matriz) {
	System.out.println("\n\nMostrando matriz1...\n\n");
	
	for(int i=0;i<matriz.length;i++)
		for(int j=0;j<matriz[i].length;j++)
		{
			matriz[i][j]=(int)(Math.random()*10+1);				
		}
	}
	
	public static void muestraMatriz (int [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			System.out.print("\t"+i);
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<matriz.length;i++) {
			System.out.print(i);
			for(int j=0;j<matriz[i].length;j++)
			{
				System.out.print("\t"+matriz[i][j]);				
			}
			System.out.println();
		}
	}
	
	public static int sumaMatriz (int [][] matriz) {
		int Acumulador=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				Acumulador= Acumulador+matriz[i][j];				
			}
		return Acumulador;
	}
	
	public static void buscarElemento (int [] [] matriz, int numero) {
		int cuentanumero=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				if (matriz[i][j]==numero)	{
					System.out.println("En la fila "+i+" esta el numero: "+numero);
					cuentanumero++;
				}
			}
		System.out.println("el numero ha aparecido "+cuentanumero+" veces");
	}
	
	public static boolean esMatrizEscalar(int [][] matriz) {
		int i=1, diagonal=matriz[0][0];		
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length) {
			if (matriz[i][i]!=diagonal) {
				return false;
			}
			i++;
		}
		
	/*	for(i=1;i<matriz.length;i++)
		{
			if(matriz[i-1][i-1]!=matriz[i][i])
				return false;
		}*/
		
		return true;
	}
	
	public static boolean esMatrizCuadrada (int [][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			if(matriz.length!=matriz[i].length)
				return false;
		}
		
		return true;
	}
	
	public static boolean esMatrizIdentidad(int[][] matriz) {
		if(!esMatrizCuadrada(matriz))
			return false;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {			
				if(i==j && matriz[i][j]!=1)
					return false;
				else if(i!=j && matriz[i][j]!=0)
					return false;				
			}
		}
		
		return true;
	}
	
	public static void esMatrizTriangular (int [][] matriz) {
		
		if(!esMatrizCuadrada(matriz)) 
			System.out.println("La matriz no es cuadrado, por lo tanto no es triangular");
		else if(esMatrizTriangularSuperior(matriz))
			System.out.println("La matriz es triangular superior");
		else if(esMatrizTriangularInferior(matriz))
			System.out.println("La matriz es triangular inferior");
		else
			System.out.println("La matriz no es triangular");
		
	}
	
	public static boolean esMatrizTriangularInferior (int [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {			
				if (j<i && matriz[i].length!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean esMatrizTriangularSuperior (int [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {			
				if (matriz[i].length!=0) {
					return false;
				}
			}
		}
		return true;
	}

}
