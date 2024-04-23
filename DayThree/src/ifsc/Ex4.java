package ifsc;

public class Ex4 {

	public static void main(String[] args) {

		double[] array = { 2, 10, 6, 4, 8};
		double soma = 0;
		
		for(int i =0; i<array.length; i++) {
			
			soma = soma + array[i];
		}
		
		double media = soma/array.length;
		System.out.println("Media = " + media);

	}

}
