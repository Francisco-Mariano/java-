package todosdados;

public class Dados {

	public String nomeProduto;
	public double preco;
	public int quantidade;
	public double valorTotalEstoque = 0;

	public double valorEstoque() {
		return preco * quantidade;
	}

	public void entradaEstoque(int quantidade) {
		this.quantidade += quantidade;

	}

	public void saidaEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nomeProduto.toUpperCase() 
				+ " R$" + String.format("%.2f",preco) 
				+ ", " + quantidade 
				+ " unidades, Total: R$" 
				+ String.format("%.2f",valorEstoque())
				;
	}
}
