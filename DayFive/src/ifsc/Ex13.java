package ifsc;

public class Ex13 {

	public static void main(String[] args) {
		
		//Escreva um programa Java para encontrar valores duplicados em um array de valores de string.
		
		String[] texto = {"catapimbas", "eita", "carambolas", "eita", "mds", "bacana", "mds"};
		
		System.out.println("Valores repetidos:");
		
		for(int i=0; i<texto.length; i++) {
			
			for(int j=0; j<texto.length; j++) {
				
				if(j!=i && !texto[j].equals("")) {	
			
					if(texto[i].equals(texto[j])){
						System.out.println(texto[i]);
						texto[j]="";
					}
				}
			}
		}	

	}

}
