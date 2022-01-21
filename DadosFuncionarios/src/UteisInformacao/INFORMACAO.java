package UteisInformacao;

public class INFORMACAO {

	public String nome;
	public double salario;
	public double tributosSalarios= 1000;
	public double taxa = 0;

	public double salarioLiquido() {
		return salario - tributosSalarios;
	}

	public void acrecimosTaxa(double taxa) {
		this.taxa = taxa ;
	}

	public String toString() {
		return nome + " R$ " + String.format("%.2f", (salarioLiquido() + salario * (taxa / 100)));
	}
}
