package vectores;

public class EjerciciosFunciones {
	
	public static void main(String[] args) {
		int [] vectorParaMostrar= new int [10];
		int [] vectorPos= new int [6];
		int [] vectormult=new int [5];
		int valorposi=0, posicion=0, nummult=0;
		
		/*1. Mostrar vector
		muestraValoresVector(vectorParaMostrar);
		*/
		
		/*2. Devolver posición
		for(int i=0;i<vectorPos.length;i++) {
			System.out.println("Introduce el valor de la posición "+i);
			vectorPos[i]=Entrada.entero();
		}
		posicion=devuelvePosicion(valorposi, vectorPos);
		*/
		
		/*3. multiplicacion vectores
		for(int i=0;i<vectormult.length;i++) {
			System.out.println("Introduce el valor de la posición "+i);
			vectormult[i]=Entrada.entero();
		}
		System.out.println("Introduce un numero por el que quieres multiplicar");
		nummult=Entrada.entero();
		multiplicaPropioVector(nummult, vectormult);
		for(int i=0;i<vectormult.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectormult[i]);
		}
		*/
		
		//4. multiplica un vector en otro
		for(int i=0;i<vectormult.length;i++) {
			System.out.println("Introduce el valor de la posición "+i);
			vectormult[i]=Entrada.entero();
		}
		System.out.println("Introduce un numero por el que quieres multiplicar");
		nummult=Entrada.entero();
		multiplicaPropioVector(nummult, vectormult);
		muestraValoresVector(vectormult);
	}
	
	public static void muestraValoresVector (int [] Vector) {
		for(int i=0;i<Vector.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+Vector[i]);
		}
	}
	
	public static int devuelvePosicion (int posi, int [] Vector) {
		for(int i=0;i<Vector.length;i++) {
			if (Vector[i]==posi) {
				return i;
			}
		}
		return -1;
	}
	
	public static void multiplicaPropioVector (int num, int [] Vector) {
		for(int i=0;i<Vector.length;i++) {
			Vector[i]=Vector[i]*num;
		}
	
	}
	
	public static int [] multiplicaVectorEnOtro (int num, int [] Vector) {
		int [] vectorAux=new int [Vector.length];
		for(int i=0;i<Vector.length;i++) {
			Vector[i]=Vector[i]*num;
		}
		return vectorAux;
	}

}
