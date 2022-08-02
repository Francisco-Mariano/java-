package estudo_bomDia;

import java.util.Scanner;

public class bomDia {

	public static void main(String[] args) {

		Scanner malucoBeleza = new Scanner(System.in);
		int x;
		String s1, s2, s3;

		System.out.printf("Informe:%n");
		x = malucoBeleza.nextInt();
		malucoBeleza.nextLine();
		s1 = malucoBeleza.nextLine();
		s2 = malucoBeleza.nextLine();
		s3 = malucoBeleza.nextLine();
		System.out.println("Dados Digitados \n");
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		malucoBeleza.close();
	}

}
