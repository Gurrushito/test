package ejercicios_boletin_2;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		String jugador1=" ", jugador2=" ";
		// INICIO
		System.out.println("Introduzca piedra, papel o tijeras");
		jugador1= Entrada.cadena();
		System.out.println("Introduzca piedra, papel, tijeras");
		jugador2= Entrada.cadena();
		
		if ((jugador1.compareTo("piedra")==0) && (jugador2.compareTo("tijeras")==0)) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if ((jugador1.compareTo("papel")==0) && (jugador2.compareTo("piedra")==0)) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if ((jugador1.compareTo("tijeras")==0) && (jugador2.compareTo("papel")==0)) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if ((jugador1.compareTo("tijeras")==0) && (jugador2.compareTo("piedra")==0)) {
			System.out.println("El jugador 2 ha ganado la partida");
		}
		if ((jugador1.compareTo("piedra")==0) && (jugador2.compareTo("papel")==0)) {
			System.out.println("El jugador 2 ha ganado la partida");
		}
		if ((jugador1.compareTo("papel")==0) && (jugador2.compareTo("tijeras")==0)) {
			System.out.println("El jugador 2 ha ganado la partida");
		}
		if (jugador1.compareTo(jugador2)==0) {
			System.out.println("Han empatado");
		}
	}

}
