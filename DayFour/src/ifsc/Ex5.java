package ifsc;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] array = { 2.3, 4.55, 6.2, 8.0, 10.1, 12.48 };
		double soma =0;
		
		System.out.println("Digite o valor que procura no array: ");
		String valorTxt = scan.nextLine();
		double valor = Double.valueOf(valorTxt);
		
		for(int i=0; i<array.length; i++) {
			if(valor == array[i]) {
				array[i]=1;
			}
			else {
				array[i]=0;
				
			}
			
		}
		
		for(int i=0; i<array.length; i++) {
			soma = soma + array[i];
			
		}
			if(soma == 1) {
				System.out.println("Valor " + valor + " encontrado no array");
			}
			if(soma == 0) {
				System.out.println("Valor " + valor + " nao foi encontrado no array");
			}

	}


}
