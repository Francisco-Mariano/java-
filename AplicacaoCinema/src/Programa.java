import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cinema objeto1, objeto2, objeto3;
		objeto1 = new Cinema(); // Cria o objeto
		objeto2 = new Cinema(); // Cria o Obejeto
		objeto3 = new Cinema(); // Cria obejto

		Scanner sc = new Scanner(System.in);

		System.out.println("\ninforme o titulo:");
		objeto1.titulo = sc.nextLine(); // Istancia do objeto titulo
		System.out.println("\ninforme o genero: ");
		objeto1.genero = sc.nextLine();// Istancia do objeto genero
		System.out.println("informe o avalia��o: ");
		objeto1.avaliacao = sc.nextInt();// Istancia do objeto avalia��o
		System.out.println("\n");

		System.out.println("informe o titulo: ");
		objeto2.titulo = sc.next();// Istancia��o do objeto titulo
		System.out.println("informe o genero: ");
		objeto2.genero = sc.next(); // Istanci�o do objeto genero
		System.out.println("informe o avalia��o: ");
		objeto2.avaliacao = sc.nextInt();// Istancia��o do objeto avalia��o
		System.out.println("\n");

		System.out.println("informe o titulo: ");
		objeto3.titulo = sc.next();// Istancia��o do objeto titulo
		System.out.println("informe o genero: ");
		objeto3.genero = sc.next();// Istanci�o do objeto genero
		System.out.println("informe o avalia��o: ");
		objeto3.avaliacao = sc.nextInt();// Istancia��o do objeto avalia��o
		System.out.println("\n");

		sc.close();

		int soma = valores(objeto1.avaliacao, objeto2.avaliacao, objeto3.avaliacao);
		resultado(soma);
	}

	public static int valores(int x, int y, int z) {
		int somaTotal;
		somaTotal = (x + y + z) / 3;
		return somaTotal;
	}

	public static void resultado(int values) {
		System.out.println("O resultado � " + values);
	}
}
