package ejerciciosRecursividad;

public class EjerciciosRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		
		//System.out.println("De qué número quieres hacer la tabla: ");
		//numero=Entrada.entero();
		
		//int res=potencia(2,4);
		
		//System.out.println("La potencia de 2 elevado a 4 es"+res);
		
		//imprimeImparesNoPrimos(17);
		
		System.out.println("Invertir número: "
							+invertirNumero(1234));
		
		System.out.println("Invertir número: "
				+invertirNumeroFacilito(1234,4));
	}

	public static void tablaDeMultiplicar(int num,int j)
	{
		//caso base
		if(j==1) {
			System.out.println(num+"x"+j+"="+num*j);
		//caso recursivo	 
		}else {
			tablaDeMultiplicar(num,j-1);
			System.out.println(num+"x"+j+"="+num*j);	
						
		}
	}
	
	public static int potencia(int base, int exponente)
	{
		int pot;
		//caso base
		if(exponente==0) {
			return 1;
		}else { //caso recursivo
			pot=base*potencia(base, exponente-1);
			return pot;
		}
	}
	
	public static void imprimeCifrasNumero(int num)
	{
		int cifra;
		int restNumero;
		//caso base
		if(num<10)
			System.out.println(" "+num);
		else //caso recursivo
		{
			cifra=num%10;
			restNumero=num/10; 
					
			imprimeCifrasNumero(restNumero);
			System.out.println(" "+cifra);
		}
	}	
	
	public static void imprimeImparesNoPrimos(int num) {
		int i = 2;
		
		// caso base		
		if (num == 1) {
			// no hace nada porque considero el 1 primo
		} else { //caso recursivo			
			
			imprimeImparesNoPrimos(num - 1);
			
			while ((i <= num / 2) && num % i != 0) {
				i++;
			}		
			
			if ((num%2!=0) && (i < num / 2)) 
				System.out.println(num);		
		
		}
	}
	
	public static int invertirNumeroFacilito(int num,int cif)
	{
		int numInv=0;
		
		if (num<10) {
			return num;
		} 
		// Caso Recursivo
		else {			
			numInv=num%10*(int)Math.pow(10, cif-1)
								+invertirNumeroFacilito(num/10,cif-1);
			return (numInv);
		}
	}
	
	public static int invertirNumero(int num) {
		int numInv=0, cifras=0, numOtro=0;
		
		// Caso Base
		if (num<10) {
			return num;
		} 
		// Caso Recursivo
		else {
			
			numOtro=num;
			
			while (numOtro>0) {
				numOtro=numOtro/10;
				cifras++;
			}
			numInv=num%10*(int)Math.pow(10, cifras-1)
								+invertirNumero(num/10);
			return (numInv);
		}
	}
	
	
public static int sumarDigitos(int num) {	
		if(num<10) {			
			return num;			
		} else {			
			return (num%10 + sumarDigitos(num/10));			
		}		
	}
}
		
	
	

