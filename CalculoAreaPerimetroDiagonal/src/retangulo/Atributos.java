package retangulo;

public class Atributos {

	public double altura;
	public double largura;

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return (altura + largura) * 2;
	}

	public double diagonal() {
		double diagonal = Math.pow(altura, 2) + Math.pow(largura, 2);
		return Math.sqrt(diagonal);
	}

	public String toString() {
		return 
				"Area = " + String.format("%.2f", area()) + "\n" + 
				"Perimetro = " + String.format("%.2f", perimetro()) +"\n" + 
				"Diagonal = " + String.format("%.2f", diagonal());

	}
}
