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
		System.out.printf("Funcionario: " + informacao.nome.toUpperCase() + " "+  String.format("R$%.2f ", informacao.salarioLiquido()));
		System.out.println("");
		System.out.println("Com  porcentagem de acrescimo no salario:");
		 double taxa = sc.nextDouble();
		informacao.acrecimosTaxa(taxa);

		//System.out.printf("Dados atualizados " + informacao.nome.toLowerCase() + String.format("R$ %.2f",informacao));
		System.out.println(informacao );
		sc.close();

	}

}
