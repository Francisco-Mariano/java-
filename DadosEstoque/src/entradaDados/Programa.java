package entradaDados;

import java.util.Scanner;

import todosdados.Dados;

public class Programa {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);

		Scanner guardaValor = new Scanner(System.in);
		Dados dados = new Dados();

		System.out.println("Informe o nome do protudo");
		dados.nomeProduto = guardaValor.nextLine();
		System.out.println("Informe o preco do porduto");
		dados.preco = guardaValor.nextDouble();
		System.out.println("Informe a quantidade do produto");
		dados.quantidade = guardaValor.nextInt();
		System.out.println("Informe a quantidade no estoque");
		dados.quantidade = guardaValor.nextInt();

		System.out.printf("O Valor no estoque é R$%.2f!", dados.valorEstoque());
		System.out.println(dados);

		System.out.println("\nInforme a qunatidade que deseja add no estoque");
		int novaQuantidade = guardaValor.nextInt();
		dados.entradaEstoque(novaQuantidade);
		System.out.println("Atualização" + dados);

		System.out.println("Informe a qunatidade que deseja remover do estoque ");
		int removeQuantidade = guardaValor.nextInt();
		dados.saidaEstoque(removeQuantidade);
		System.out.printf("Remove" + dados);
		
		System.out.println("\nTenha uma boa noite ");

	}

}
