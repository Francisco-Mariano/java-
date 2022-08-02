package execicio01;

import java.util.Locale;

public class ExecicioUM {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		String produto1 = "Computador";
		String produto2 = "Desck Top";

		int anos = 30;
		int codigo = 5290;
		char sexo = 'F';

		double preco1 = 2100;
		double preco2 = 650.50;
		double total = 53.234567;

		System.out.println("Produto!\n");
		System.out.printf("%s, com preço de R$ %.2f%n", produto1, preco1);
		System.out.printf("%s compreco R$ %.2f%n",produto2, preco2);
		System.out.printf("Com %d anos, %d e sexo %c.%n",anos,codigo,sexo);
		System.out.printf("Mas com oito casa decimais %.8f.%n",total);
		System.out.printf("Com três casas decimais %.3f%n", total);
		

	}

}
