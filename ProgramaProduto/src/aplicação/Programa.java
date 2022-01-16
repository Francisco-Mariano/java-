package aplicação;

import java.util.Locale;
import java.util.Scanner;

import uteis.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto:");
		System.out.print("Entre com o nome do prodto: ");
		produto.nome = sc.nextLine();
		System.out.print("Entre com o preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Entre com a quantidade no estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.printf("\nDados do Produto: " + produto.toString().toUpperCase() + "!!!");

		System.out.println();
		System.out.println("Ente com o numero de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);

		System.out.println();
		System.out.println("Datos atualizados no estoque " + produto);

		System.out.println();
		System.out.println("Ente com o numero de produtos para removidos no estoque :");
		quantidade = sc.nextInt();
		produto.removeProdutros(quantidade);
		System.out.println("Datos atualizados no estoque " + produto);

		sc.close();
	}

}
