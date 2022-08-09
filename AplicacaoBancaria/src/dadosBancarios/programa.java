package dadosBancarios;

import java.util.Scanner;

import dadosUteis.Uteis;

public class programa {

	public static void main(String[] args) {
		double saldo;

		Uteis papelao = new Uteis();
		Scanner usaPonteiro = new Scanner(System.in);

		System.out.printf("Entre com o numero da conta :");
		int numeroConta = usaPonteiro.nextInt();

		System.out.printf("Entre com o titular da conta :");
		String x = usaPonteiro.nextLine();
		String nome = usaPonteiro.nextLine().toUpperCase();

		Uteis uteis = new Uteis(numeroConta, nome);

		System.out.printf("Deseja fazer algum depoisto (S/N)?");
		String validaDeposito = usaPonteiro.nextLine().toUpperCase();
		System.out.println();

		if (validaDeposito.contains("S")) {
			System.out.printf("Informe o valor do deposito :");
			saldo = usaPonteiro.nextDouble();
			uteis.addSaldoConta(saldo);

			System.out.println(uteis);

		} else if (validaDeposito.contains("N")) {
			System.out.println("Dados da conta:");
			System.out.printf("" + uteis);
			System.out.println();
			System.out.printf("Entre com valor de deposito:");
			saldo = usaPonteiro.nextDouble();
			uteis.addSaldoConta(saldo);
			System.out.println("Dados da conta Atualizados!!!");
			System.out.printf(uteis + "\n");
		}
		System.out.println();
		System.out.println("Informe o valor de saque");
		saldo = usaPonteiro.nextDouble();
		uteis.remSaldoConta(saldo);
		System.out.println("Dados da conta Atualizados!!!");
		System.out.printf("" + uteis);

		usaPonteiro.close();
		System.out.println("\nTenha um bom dia!!!!");
	}

}
