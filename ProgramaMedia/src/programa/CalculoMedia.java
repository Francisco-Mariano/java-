package programa;


public class CalculoMedia {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public  String NomeAluno() {
		return nome;
	}

	public  void PrimeiraNota() {
		this.nota1 = nota1 * .30;
	}

	public void SegundaNota() {
		this.nota2 = nota2 * 35;
	}

	public void TerceiraNota() {
		this.nota3 = nota3 * .35;
	}

	public double Media() {
		double media = nota1 + nota2 + nota3;
		return media;

	}

	public String toString() {
		return NomeAluno() + "\n " + nota1 + "\n " + nota2 + "\n " + nota3 + "\n" + "NOTA FINAL = "
				+ String.format(" %.2f", Media());

	}

}
