import java.util.Scanner;

public class maiorDeTresNumeros {
	int soma, teste = 0;

	public static void main(String[] args) {

		Scanner guardaNumeroVariavel = new Scanner(System.in);
		System.out.printf("Informe o primeiro numero : ");
		int num1 = guardaNumeroVariavel.nextInt();
		System.out.printf("Informe o segundo numero : ");
		int num2 = guardaNumeroVariavel.nextInt();
		System.out.printf("Informe o terceiro numero : ");
		int num3 = guardaNumeroVariavel.nextInt();

		int max =CalculaMax(num1, num2, num3);
		emprimeResultado(max);

		guardaNumeroVariavel.close();

	}

	public static int CalculaMax(int num1, int num2, int num3) {
		int aux;

		if (num1 > num2 && num1 > num3) {
			aux = num1;
		} else if (num2 > num1 && num2 > num3) {
			aux = num2;

		} else  {
			aux = num3;
		}
		return aux;

	}
	
	public static void emprimeResultado (int max) {
		System.out.printf("O maior numero é " + max);
		
	}

}
