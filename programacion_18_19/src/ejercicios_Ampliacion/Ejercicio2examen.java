package ejercicios_Ampliacion;

public class Ejercicio2examen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int numeroCarta=0,numeroCartaMaximo=12, numeroCartaMinimo=1, numAnterior=0, numeroCartaUsuario=0, palonumerico=0, palomin=1, palomax=4, i=0;
		String palos=" ", paloUsuario=" ";
		Boolean acertaste=false;
		
		//INICIO
		
		System.out.println("Generando carta...");
		numeroCarta=(int)(Math.random()* numeroCartaMaximo-numeroCartaMinimo)+numeroCartaMinimo; 
		System.out.println(numeroCarta);
		palonumerico=(int)(Math.random()* palomax-palomin)+palomin;
		System.out.println(palonumerico);
		switch (palonumerico) {
		case 1:
			palos="OROS";
		break;
		case 2:
			palos="ESPADAS";
		break;
		case 3:
			palos="COPAS";
		break;
		case 4:
			palos="BASTOS";
		break;
	}
		
		System.out.println("YA! EMPIEZA EL JUEGO, ADIVINA MI CARTA!");
		System.out.println("Te quedan 3 intentos");
		
		while (i<3 && acertaste==false) {
			
			System.out.println("Introduce el numero de la carta:");
			numeroCartaUsuario=Entrada.entero();
			System.out.println("Introduce el palo");;
			paloUsuario=Entrada.cadena();
		
		if((numeroCarta==numeroCartaUsuario) && (palos.compareTo(paloUsuario)==0)) {
			System.out.println("MUY BIEN! ACERTASTE!");
			acertaste=true;
		}
		else {
			System.out.println("FALLASTE");
		}
		i++;
		}
	}
}
