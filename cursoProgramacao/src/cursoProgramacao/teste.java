package cursoProgramacao;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		System.out.println("Ola mundo!");
		Scanner malucoBeleza = new Scanner(System.in);
		int num1 = 0;
		int soma = 0;
		System.out.println("Digite o primeiro numero: ");
		num1 = malucoBeleza.nextInt();

		while (num1 != 0) {
			System.out.println("");
			System.out.print("Digite outro numero: ");
			num1 = malucoBeleza.nextInt();
			soma = soma + num1;
			System.out.println("soma =" + soma);
		}
		if (num1 == 0)
			System.out.println("Encerramento do programa vc digitou " + num1 +". Sai do programa!");
		malucoBeleza.close();
	}
}
