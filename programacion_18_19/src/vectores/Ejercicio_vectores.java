package vectores;

public class Ejercicio_vectores {
	
	public static void main(String[] args) {
		//1
		char [] vocales={'a','e','i','o','u'};
		
		//2
		float [] vectorF1=new float [10];
		
		for(int i=0;i<vectorF1.length;i++) {
			System.out.println("Dale un valor a la posicion "+i+" : "+vectorF1[i]);
			vectorF1[i]=(float) Entrada.real();
		}
		
		//3
		float [] vectorF2;
		vectorF2=vectorF1.clone();
		
		//4
		final int NUM=15;
		int [] vectorI=new int [NUM];
		
		//5
		for(int i=0;i<vectorI.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorI[i]);
		}
		
		for(int i=0;i<vectorI.length;i++) {
			vectorI[i]=(i+1)*5;
			System.out.println("En la posición "+i+" está el valor "+vectorI[i]);
		}
		
		//6
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		}
		else {
			System.out.println("Los vectores son diferentes");
		}
		
		//7
		for(int i=0;i<vectorF2.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF2[i]=(float)Entrada.real();
		}
		//8
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		}
		else {
			System.out.println("Los vectores son diferentes");
		}
		//9
		float [] vectorFsuma=new float [vectorF1.length];
		for(int i=0;i<vectorFsuma.length;i++)
		vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		
		//10
		for(int i=0;i<vectorFsuma.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorFsuma[i]);
		}
		
		//11
		for(int i=0;i<vocales.length;i++) {
			vocales[i]=(char) ((int)vocales[i]-32);
		}
		
		//12
		for(int i=0;i<vocales.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vocales[i]);
		}
	}

}
