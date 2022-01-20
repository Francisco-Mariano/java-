package uteis;

public class Calculo {

	public double baseMenor;
	public double baseMaior;

	public double calculaArea() {

		return baseMenor * baseMaior;
	}

	public double calculaPerimetro() {

		return  2 * (baseMenor + baseMaior);
	}

	public double calculaDiagonal() {
		double a = Math.pow(baseMenor, 2) + Math.pow(baseMaior, 2);

		return  Math.pow(a, 2);
	}
}
