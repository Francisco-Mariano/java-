package MediaCalculo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		 
		double x;
		x=ler.nextDouble();
		
		System.out.println("Ol� Mundo!");
		
		System.out.printf("Voc� digitou %.2f%n", x);
		ler.close();
	}
}
