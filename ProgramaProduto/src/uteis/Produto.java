package uteis;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;	
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double totalValorEstoque() {
		return preco * quantidade;

	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutros(int quantidade) {
		this.quantidade -= quantidade;

	}

	public String toString() {
		return nome.toUpperCase() + ", " + "R$" + String.format("%.2f", preco) + ", " + "quantidade " + quantidade
				+ ", " + " Total: R$" + String.format("%.2f", totalValorEstoque());
	}

}
