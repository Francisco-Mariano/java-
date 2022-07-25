import java.util.Scanner;

public class operadorTelefonia {

	public static void main(String[] args) {

		double planoBasico = 50.00;
		int minutosBasico = 100;
		double minutoExedente = 2.00;
		double minutosConsumido = 0;

		Scanner guardaValorVariavelObjeto = new Scanner(System.in);
		System.out.println("informe a quantidade de minutos que a pessoa cosumiu!\n");
		minutosConsumido = guardaValorVariavelObjeto.nextInt();

		double valorConta = (minutosConsumido <= 100) ? planoBasico
				: (minutosConsumido - minutosBasico) * minutoExedente + planoBasico;
		
		System.out.printf("Você pagará R$%.2f", valorConta);

		System.out.println("Programa encerrado!\n");
		guardaValorVariavelObjeto.close();

	}
}
