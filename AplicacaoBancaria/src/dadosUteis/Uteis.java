package dadosUteis;

public class Uteis {
	private int numeroConta;
	private String nome;
	private double saldoConta;

	public Uteis() {
	}
	
	 public Uteis(int numeroConta, String nome){
		 this.numeroConta = numeroConta;
		 this.nome = nome;
	 }

	 public Uteis(int numeroConta, String nome, double saldoConta){
		 this.numeroConta = numeroConta;
		 this.nome = nome;
		 this.saldoConta = saldoConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void addSaldoConta(double saldoConta) {
	this.saldoConta+= saldoConta;	
	}

	public void remSaldoConta(double saldoConta) {
		this.saldoConta -= saldoConta + 5;
	}
	
	public String toString() {
		return  "Conta: " + numeroConta +
				" Titular: " + nome+ 
				" Saldo em conta:" + 
				String.format("R$%.2f",saldoConta );
	}

}
