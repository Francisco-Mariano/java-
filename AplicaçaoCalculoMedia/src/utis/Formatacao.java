package utis;

public class Formatacao {

	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;

	public double notaTrimestre01() {
		return (nota01 + nota02 + nota03) * 0.30;
	}

	public double notaTrimestre02() {
		return (nota01 + nota02 + nota03) * 0.35;
	}

	public double notaTrimestre03() {
		return (nota01 + nota02 + nota03) * 0.35;
	}

	public double notaAvaliacao() {
		return notaTrimestre01() + notaTrimestre02() + notaTrimestre03();

	}
}
