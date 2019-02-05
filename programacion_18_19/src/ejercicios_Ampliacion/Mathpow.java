package ejercicios_Ampliacion;

public class Mathpow {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int max=0, min=0, numAleatorio=0, numAnterior=0;
		
		//INICIO
		
		System.out.println("Introduzca un numero maximo");
		max=Entrada.entero();
		
		System.out.println("Introduzca un numero minimo");
		min=Entrada.entero();
		
		numAnterior=(int)(Math.random()*max-min)+min;//Genero el primer numero aleatorio
		
		numAnterior=max+1;//Numero anterior maximo +1
		
		while(numAleatorio<min) { //Mientras que el numero aleatorio sea menor que el minimo
			numAleatorio=(int)(Math.random()* max-min)+min; //Genero numero
			
			if(numAleatorio<numAnterior) { //si el numero aleatorio es menor que maximo +1 en la primera vez
				System.out.println(numAleatorio); //Imprime el numero aleatorio
				numAnterior=numAleatorio; //Igualo el numero anterior a el aleatorio
				
			}
		}

	}
}
