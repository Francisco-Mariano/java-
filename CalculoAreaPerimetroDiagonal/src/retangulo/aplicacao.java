package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner guardaVariavel = new Scanner(System.in);

		Atributos atributo = new Atributos();
		System.out.printf("Infome altura: ");
		atributo.altura = guardaVariavel.nextDouble();
		System.out.printf("Infome largura: ");
		atributo.largura = guardaVariavel.nextDouble();
	
		System.out.println(atributo);

		guardaVariavel.close();

	}

}
