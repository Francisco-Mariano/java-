package uteis;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return nome.toUpperCase() + ", " + "R$" + String.format("%.2f", preco) + ", " + "quantidade " + quantidade
				+ ", " + " Total: R$" + String.format("%.2f", totalValorEstoque());
	}

}
