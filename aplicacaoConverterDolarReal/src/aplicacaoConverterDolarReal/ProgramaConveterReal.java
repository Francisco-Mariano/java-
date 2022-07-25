package aplicacaoConverterDolarReal;

import java.util.Scanner;

import CalculaMoedaReal.moedaReal;

public class ProgramaConveterReal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int zero = 0;
		while (zero == 0) {
			System.out.println("Qual o valor do Dolar? ");
			double dolar = sc.nextDouble();

			System.out.println("Quantos Dolares seram comprados? ");
			double valorEntradaDolar = sc.nextDouble();

			double c = moedaReal.CalculaIOFTotal(dolar, valorEntradaDolar);
			System.out.printf("Valor a ser pago em reais = %.2f", c);
			
		
			System.out.printf("\nDigite Zero para continuar...");
			zero = sc.nextInt();
		
	    	
	    	
		}

		 sc.close();
		
	}
	
}
