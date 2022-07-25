package TesteProtegido;

public class LerLinhaALinnha {

	public static void main(String[] args) {

		String[] wordListOne = { "24/7", "varias camadas", "30.000 pés", "B-TO-B", "todos ganham", "front-end",
				"basedo na web", "difundido ", "inteligente", "seis sigma", "caminho critico", "dinâminco" };

		String[] wordListTwo = { "habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido",
				"agrupado", "solidificado", "independentre da maquina", "posicionado", " em rede", "dedicado",
				"alavancado", "alinado", "destinado", "compartilhado", "cooperativo", "acelerado" };

		String[] wordListThree = { "processo", "ponto", "maxinmo", "solução", "arquitetura", "habilitação no nucleo",
				"estrategia", "mindshare", "portal", "espaço", "visão", "paradgima", "missão" };

		int oneLength = wordListOne.length;
		System.out.println("\nlista 1:\nNumero de palavras em cada lista :" + oneLength);
		int twoLength = wordListTwo.length;
		System.out.println("\nLista 2: \nNumero de palavras em cada lista:" + twoLength);
		int threeLength = wordListThree.length;
		System.out.println("\nLista 3: \nNumero de palavras em cada lista:" + threeLength);

		int rand1 = (int) (Math.random() * oneLength);
		System.out.println("\n Numero de rand1: " + rand1);

		int rand2 = (int) (Math.random() * twoLength);
		System.out.println("\n Numero de rand2: " + rand2);

		int rand3 = (int) (Math.random() * threeLength);
		System.out.println("\n Numero de rand3: " + rand3);

		String formacaoFrase = wordListOne[rand1] + " " + wordListTwo[rand2] + "" + wordListThree[rand3];
		
		System.out.println(formacaoFrase);
	}
}
