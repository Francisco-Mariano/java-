package AplicacaoDadosFuncionarios;

import java.util.Scanner;

import UteisInformacao.INFORMACAO;

public class DADOSFUNCIONARIOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		INFORMACAO informacao = new INFORMACAO();
		System.out.println("INFORME O NOME DO FUNCIONARIO:");
		informacao.nome = sc.nextLine();
		System.out.println("INFORME O SALARIO DO FUNCIONARIO:");
		informacao.salario = sc.nextDouble();
		System.out.println("");
		System.out.printf("Funcionario: " + informacao.nome.toUpperCase() + " R$%.2f", informacao.salarioLiquido());
		System.out.println("");
		System.out.println("Com  porcentagem de acrescimo no salario:");
		double taxaPorcen = 0.00;
		taxaPorcen = sc.nextDouble();
		
		System.out.printf("Dados atualizados " + informacao.nome.toLowerCase() 
				+ String.format(" %.2f",informacao.salarioLiquido()+informacao.salario*(taxaPorcen/100)));

		sc.close();

	}

}
