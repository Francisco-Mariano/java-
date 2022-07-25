package projeto;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);
		Scanner guardaDados = new Scanner(System.in);
		DadosFuncionarios dados = new DadosFuncionarios();
		
		System.out.println("Informe o nome do funcionario: ");
		dados.nome = guardaDados.nextLine().toUpperCase();
		System.out.println("Informe o salario Burto: ");
		dados.salario = guardaDados.nextDouble();
		System.out.println("Informe o imposto: ");
		dados.imposto = guardaDados.nextDouble();
		System.out.println(dados);
		System.out.println("Qual a porcentagem para aumentar o salario: ");
		double novoIncremento = guardaDados.nextDouble();
		
		dados.valorIncremento(novoIncremento);
		System.out.println(dados);

		guardaDados.close();
	}

}
