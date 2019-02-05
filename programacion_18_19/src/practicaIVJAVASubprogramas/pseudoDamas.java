package practicaIVJAVASubprogramas;

	public class pseudoDamas {
		
	static boolean fichaProg1=true, fichaProg2=true, fichaProg3=true, fichaUser1=true, fichaUser2=true, fichaUser3=true;
	static int XProg1=3, YProg1=2, XProg2=15, YProg2=2, XProg3=27, YProg3=2, XUser1=3, YUser1=18, XUser2=15, YUser2=18, XUser3=27, YUser3=18, TAMFIL=20, TAMCOL=30;
	
	public static void main(String[] args) {
		int ficha=0, fichaUsuario=0;
		String ladoProg=" ", ladoUsuario=" ";
		char tablas=' ', jugador=' ';
		while ((fichaProg1==true || fichaProg2==true || fichaProg3==true) && (fichaUser1==true || fichaUser2==true || fichaUser3==true) && tablas!='s') {
			
			imprimeLetrasTablero();
			construirTablero();
			
			ladoProg=ladoAleatorio();
			ficha=fichaAleatoria();
			if(ladoProg.equals("izquierda")) {
				mueveIzquierdaFichaPrograma(ficha);
				comeFichas(jugador, ficha);
			}
			if(ladoProg.equals("derecha")) {
				mueveDerechaFichaPrograma(ficha);
				comeFichas(jugador, ficha);
			}
			
			System.out.println("¿Quieres tablas (s/n)?");
			tablas=Entrada.caracter();
			if(tablas=='s') {
				System.out.println("Habeis empatado");
			}
			else {
				System.out.println("Introduzca la ficha que quiere mover");
				fichaUsuario=Entrada.entero();
				System.out.println("Introduzca el lado que quiere mover la ficha");
				ladoUsuario=Entrada.cadena().toLowerCase();
				if(ladoUsuario.equals("izquierda")) {
					mueveIzquierdaFichaUsuario(fichaUsuario);
					comeFichas(jugador, fichaUsuario);
				}
				if(ladoUsuario.equals("derecha")) {
					mueveDerechaFichaUsuario(fichaUsuario);
					comeFichas(jugador, fichaUsuario);
				}
			}
			System.out.println("Habeis hecho tablas");
		}
	}
		
	public static void imprimeLetrasTablero() {
		int i=0, letraTablero=64;
		while (i<=TAMCOL) {
			if (i==3 || i==9 || i==15 || i==21 || i==27 ) {
				letraTablero++;
				System.out.print((char)letraTablero);
			}
			else {
				System.out.print(" ");
			}
		i++;
		}
		System.out.println();
	}
	
	public static void construirTablero() {
		int i=0, j=0, numTablero=1;
		for (i=0; i<=TAMFIL; i++) {
			for (j=0; j<=TAMCOL; j++) {
				if (i%4==0 || j%6==0) {
					System.out.print("*");
					if (j==TAMCOL && (i%2==0 && i%4!=0)) {
						System.out.print("\t"+numTablero);
						numTablero++;
					}
				}
				else {
					imprimeFichas(i,j);
				}
			}
			System.out.println();
		}
	}
	
	public static void imprimeFichas(int i, int j) {
		if (fichaProg1==true && j==XProg1 && i==YProg1) {
			System.out.print("P");
		}
		else if(fichaProg2==true && j==XProg2 && i==YProg2) {
			System.out.print("P");
		}
		else if(fichaProg3==true && j==XProg3 && i==YProg3) {
			System.out.print("P");
		}
		else if(fichaUser1==true && j==XUser1 && i==YUser1) {
			System.out.print("U");
		}
		else if(fichaUser2==true && j==XUser2 && i==YUser2) {
			System.out.print("D");
		}
		else if(fichaUser3==true && j==XUser3 && i==YUser3) {
			System.out.print("T");
		}
		else {
			System.out.print(" ");
		}
		
	}
	
	public static boolean mueveIzquierdaFichaPrograma(int ficha) {
		if (ficha==1 && fichaProg1==true) {
			if(XProg1<(TAMCOL-6) && YProg1<(TAMFIL+4) &&
							!((XProg2+6)==XProg1 && (YProg2+4)==YProg1 && fichaProg2==true) && 
									!((XProg3+6)==XProg1 && (YProg3+4)==YProg1 && fichaProg3==true)) {
				XProg1=XProg1+6;
				YProg1=YProg1+4;
				return true;
			}
			else {
				return false;
			}
		}
		if (ficha==2 && fichaProg2==true) {
			if(XProg2<(TAMCOL-6) && YProg2<(TAMFIL-4) && 
					!((XProg1+6)==XProg2 && (YProg1+4)==YProg2 && fichaProg2==true) && 
						!((XProg3+6)==XProg2 && (YProg3+4)==YProg2 && fichaProg3==true)) {
				XProg2=XProg2+6;
				YProg2=YProg2+4;
				return true;
			}
			else {
				return false;
			}
		}
		if (ficha==3 && fichaProg3==true) {
			if(XProg3<(TAMCOL-6) && YProg3<(TAMFIL-4) && 
					!((XProg3+6)==XProg1 && (YProg3+4)==YProg1 && fichaProg1==true) && 
						!((XProg2+6)==XProg3 && (YProg2+4)==YProg3 && fichaProg2==true)) {
				XProg3=XProg3+6;
				YProg3=YProg3+4;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static boolean mueveDerechaFichaPrograma(int ficha) {
		if (ficha==1 && fichaProg1==true) {
			if((XProg1>=3 && YProg1<=TAMFIL-4) && 
					!((XProg2-6)==XProg1 && (YProg2+4)==YProg1 && fichaProg2==true) && 
						!((XProg3-6)==XProg1 && (YProg3+4)==YProg1 && fichaProg3==true)) {
				XProg1=XProg1-6;
				YProg1=YProg1+4;
				return true;
			}
			else {
				return false;
			}
		}
		if (ficha==2 && fichaProg2==true) {
			if(XProg2>=3 && YProg2<=TAMFIL-4 && 
					!((XProg1-6)==XProg2 && (YProg1+4)==YProg2 && fichaProg1==true) && 
						!((XProg3-6)==XProg2 && (YProg3+4)==YProg2 && fichaProg3==true)) {
				XProg2=XProg2-6;
				YProg2=YProg2+4;
				return true;
			}
			else {
				return false;
			}
		}
		if (ficha==3 && fichaProg3==true) {
			if(XProg3>=3 && YProg3<=TAMFIL-4 && 
					!((XProg3-6)==XProg1 && (YProg3+4)==YProg1 && fichaProg1==true) && 
						!((XProg2-6)==XProg3 && (YProg2+4)==YProg3 && fichaProg2==true)) {
				XProg3=XProg3-6;
				YProg3=YProg3+4;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static boolean mueveIzquierdaFichaUsuario(int fichaUsuario) {
		if (fichaUsuario==1 && fichaUser1==true) {
			if(XUser1>=(TAMCOL-6) && YUser1>=2 && 
					!((XUser2-6)==XUser1 && (YUser2-4)==YUser1 && fichaUser2==true) && 
						!((XUser3-6)==XUser1 && (YUser3-4)==YUser1 && fichaUser3==true)) {
				XUser1=XUser1-6;
				YUser1=YUser1-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		if (fichaUsuario==2 && fichaUser2==true) {
			if(XUser2>(TAMCOL-6) && YUser1>=2 && 
					!((XUser1-6)==XUser2 && (YUser1-4)==YUser2 && fichaUser1==true) && 
						!((XUser3-6)==XUser2 && (YUser3-4)==YUser2 && fichaUser3==true)) {
				XUser2=XUser2-6;
				YUser2=YUser2-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		if (fichaUsuario==3 && fichaUser3==true) {
			if(XUser3>(TAMCOL-6) && YUser1>=2 && 
					!((XUser3-6)==XUser1 && (YUser3-4)==YUser1 && fichaUser1==true) && 
						!((XUser2-6)==XUser3 && (YUser2-4)==YUser3 && fichaUser2==true)) {
				XUser3=XUser3-6;
				YUser3=YUser3-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		return false;
	}
	
	public static boolean mueveDerechaFichaUsuario(int fichaUsuario) {
		if (fichaUsuario==1 && fichaUser1==true) {
			if((XUser1<(TAMCOL-6) && YUser1>=2 && 
					!((XUser2+6)==XUser1 && (YUser2-4)==YUser1 && fichaUser2==true) && 
						!((XUser3+6)==XUser1 && (YUser3-4)==YUser1 && fichaUser3==true) )) {
				XUser1=XUser1+6;
				YUser1=YUser1-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		if (fichaUsuario==2 && fichaUser2==true) {
			if(XUser2<(TAMCOL-6) && YUser1>=2 && 
					!((XUser1+6)==XUser2 && (YUser1-4)==YUser2 && fichaUser1==true) && 
						!((XUser3+6)==XUser2 && (YUser3-4)==YUser2 && fichaUser3==true)) {
				XUser2=XUser2+6;
				YUser2=YUser2-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		if (fichaUsuario==3 && fichaUser3==true) {
			if(XUser3<(TAMCOL-6) && YUser1>=2 && 
					!((XUser3+6)==XUser1 && (YUser3-4)==YUser1 && fichaUser1==true) && 
						!((XUser2+6)==XUser3 && (YUser2-4)==YUser3 && fichaUser2==true)) {
				XUser3=XUser3+6;
				YUser3=YUser3-4;
				return true;
			}
			else {
				System.out.println("Movimiento erroneo");
				return false;
			}
		}
		return false;
	}
	
	public static int fichaAleatoria() {
		int ficha=0;
		ficha=(int)(Math.random()*3+1);
		return ficha;
	}
	
	public static String ladoAleatorio() {
		int lado=0;
		lado=(int)(Math.random()*2+1);
		if (lado==1) {
			return "derecha";
		}
		else {
			return "izquierda";
		}
	}
	
	public static boolean comeFichas(char fichasJugadores, int fichas) {
		if(fichasJugadores=='u') {
			switch (fichas) {
			case 1:
				if (XProg1==XUser1 && YProg1==YUser1 && fichaUser1==true) {
					fichaUser1=false;
					return false;
				} else if(XProg1==XUser2 && YProg1==YUser2 && fichaUser2==true) {
					fichaUser2=false;
					return false;
				} else if(XProg1==XUser3 && YProg1==YUser3 && fichaUser3==true) {
					fichaUser3=false;
					return false;
				}
				return true;
			
			case 2:
				if (XProg2==XUser1 && YProg2==YUser1 && fichaUser1==true) {
					fichaUser1=false;
					return false;
				} else if(XProg2==XUser2 && YProg2==YUser2 && fichaUser2==true) {
					fichaUser2=false;
					return false;
				} else if(XProg2==XUser3 && YProg2==YUser3 && fichaUser3==true) {
					fichaUser3=false;
					return false;
				}
				return true;
				
			case 3:
				if (XProg3==XUser1 && YProg3==YUser1 && fichaUser1==true) {
					fichaUser1=false;
					return false;
				} else if(XProg3==XUser2 && YProg3==YUser2 && fichaUser2==true) {
					fichaUser2=false;
					return false;
				} else if(XProg3==XUser3 && YProg3==YUser3 && fichaUser3==true) {
					fichaUser3=false;
					return false;
				}
				return true;
			}
		}
		if(fichasJugadores=='p') {
			switch (fichas) {
			case 1:
				if (XUser1==XProg1 && YUser1==YProg1 && fichaProg1==true) {
					fichaProg1=false;
					return false;
				} else if(XUser1==XProg2 && YUser1==YProg2 && fichaProg2==true) {
					fichaProg2=false;
					return false;
				} else if(XUser1==XProg3 && YUser1==YProg3 && fichaProg3==true) {
					fichaProg3=false;
					return false;
				}
				return true;
			
			case 2:
				if (XUser2==XProg1 && YUser2==YProg1 && fichaProg1==true) {
					fichaProg1=false;
					return false;
				} else if(XUser2==XProg2 && YUser2==YProg2 && fichaProg2==true) {
					fichaProg2=false;
					return false;
				} else if(XUser2==XProg3 && YUser2==YProg3 && fichaProg3==true) {
					fichaProg3=false;
					return false;
				}
				return true;
				
			case 3:
				if (XUser3==XProg1 && YUser3==YProg1 && fichaProg1==true) {
					fichaProg1=false;
					return false;
				} else if(XUser3==XProg2 && YUser3==YProg2 && fichaProg2==true) {
					fichaProg2=false;
					return false;
				} else if(XUser3==XProg3 && YUser3==YProg3 && fichaProg3==true) {
					fichaProg3=false;
					return false;
				}
				return true;
			}
		}
		return true;
	}
}


