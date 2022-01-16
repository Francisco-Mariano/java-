package uteis;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

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
