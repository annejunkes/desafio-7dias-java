package ifsc;

public class Ex2 {

	public static void main(String[] args) {

		int[] array = { 1 , 2 , 3 , 4 , 6 , 20 , 35 };
		int soma = 0;
		
		for(int i=0; i<array.length; i++) {
			
			soma = soma + array[i];
			
		}
		
		System.out.println("Soma = " + soma);

	}

}
