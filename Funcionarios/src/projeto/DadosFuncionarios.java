package projeto;

public class DadosFuncionarios {

	public String nome;
	public double salario;
	public double imposto;
	public double incremento;

	public String nomeFuncionario() {
		return nome;
	}

	public double impostoFuncionario() {
		return imposto;
	}

	public void valorIncremento(double incremento) {
		this.salario += salario * (incremento / 100);
	}

	public String toString() {
		return "\n" + nomeFuncionario() + " " + String.format("R$ %.2f", this.salario - imposto);
	}
}
