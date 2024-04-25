package ifsc;

public class Ex28 {

	public static void main(String[] args) {
		//Escreva um programa Java para obter a diferença entre o maior e o menor valor em um array de inteiros.

		int[] array = {2,50,4,49};
		
		int maior = 0;
		int menor = 999999999;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] > maior) {
				maior = array[i];
			}
			
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		System.out.println("Diferenca entre maior e menor numero do array: " + (maior - menor));
	}

}
