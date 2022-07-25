package aplicacaoTriangulo;

import java.util.Scanner;
import utilitarios.Calcula;

public class CalculoTriangulo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("INFORME O VALOR DO RAIO:");
		double raio = sc.nextDouble();

		double c = Calcula.circunferencio(raio);
		double v = Calcula.volume(raio);

		System.out.printf(" Circuference : %.2f%n", c);
		System.out.printf(" Voule : %.2f%n", v);
		System.out.printf(" PI : %.3f%n", Calcula.PI);

		sc.close();
	}

}
