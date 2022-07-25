package programa;

import java.util.Scanner;

public class Estudantes {

	public static void main(String[] args) {
	
		Scanner guardaValor = new Scanner(System.in);
		CalculoMedia calculo = new CalculoMedia();
		
		System.out.printf("Informe o nome do aluno :\n");
		calculo.nome =guardaValor.nextLine();
		System.out.printf("Informe as três notas dos trimestre :\n");
		calculo.nota1 =guardaValor.nextDouble();
		calculo.nota2=guardaValor.nextDouble();
		calculo.nota3=guardaValor.nextDouble();
		System.out.println(calculo);
		
		if(calculo.Media()>= 60) {
			System.out.println("Aprovado");
		}else {
		double FaltaMedia = 60 -calculo.Media();
		System.out.printf("Reprovado! \nFalta %.2f pontos!",FaltaMedia);
		}
		
	}

}
