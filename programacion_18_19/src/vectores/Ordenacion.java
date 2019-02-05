package vectores;

public class Ordenacion {

	public static void main(String[] args) {
		int [] vector= {3,2,4,5,1};
		
		System.out.println("\nVector sin ordenar...\n");
		
		for(int i=0;i<vector.length; i++)
			System.out.print(vector[i]+"\t");
		
		System.out.println();
		
		System.out.println("\nVector ordenado...\n");
		
		ordenaVector(vector);
		
	}
	
	public static void ordenaVector (int [] vec) {
		int numAnterior=0;
		
		for(int i=0;i<vec.length; i++) {
			numAnterior=vec[i];
			if (numAnterior<vec[i+1]) {
				System.out.print(vec[i]+"\t");
			}
		}
				
	}
	
}