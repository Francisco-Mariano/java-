package MediaCalculo;

import java.util.Scanner;
import utis.Formatacao;

public class Calculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Formatacao formatacao = new Formatacao();

		formatacao.nome = sc.nextLine();
		formatacao.nota01 = sc.nextDouble();
		formatacao.nota02 = sc.nextDouble();
		formatacao.nota03 = sc.nextDouble();

		System.out.println(String.format("%.2f", formatacao.notaTrimestre01()));
		System.out.println(String.format("%.2f", formatacao.notaTrimestre02()));
		System.out.println(String.format("%.2f", formatacao.notaTrimestre03()));
		System.out.println(String.format("%.2f", formatacao.notaAvaliacao()));

		if (formatacao.notaAvaliacao() >= 60) {
			System.out.println("NOTA FINAL = " + formatacao.notaAvaliacao() + "\nAprovado");

		} else if (formatacao.notaAvaliacao() < 60) {
			System.out.println("NOTA FINAL = " + formatacao.notaAvaliacao() + "\nReprovado" + "\nFaltou "
					+ (formatacao.notaAvaliacao() - 60) + (" pontos"));
		}

	}
}
