import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Programa {

	public static void main(String[] args) {

		Scanner guardaValorObjeto = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		Triangulo x, y;
		 x =  new Triangulo();
		 y = new Triangulo();
		
		// Calculo da Area do triangulo
		System.out.println("Informe o primeiro valor de A:");
		x.a = guardaValorObjeto.nextDouble();
		System.out.println("Informe o primeiro valor de B:");
		x.b = guardaValorObjeto.nextDouble();
		System.out.println("Informe o primeiro valor de C:");
		x.c = guardaValorObjeto.nextDouble();
		System.out.printf("X1: " + x.a + "\n");
		System.out.printf("X2: " + x.b + "\n");
		System.out.printf("X3: " + x.c + "\n");

		System.out.println("Informe o primeiro valor de Y1:");
		y.a = guardaValorObjeto.nextDouble();
		System.out.println("Informe o primeiro valor de Y2:");
		y.b = guardaValorObjeto.nextDouble();
		System.out.println("Informe o primeiro valor de Y3:");
		y.c = guardaValorObjeto.nextDouble();
		System.out.printf("Y1: " + y.a + "\n");
		System.out.printf("Y2: " + y.b + "\n");
		System.out.printf("Y3: " + y.c + "\n");

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Area do trinagulo X: %.2f%n", areaX);
		System.out.printf("Area do trinagulo Y: %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("Area Maior X: %.2f", areaX);
		} else {
			System.out.printf("Area  Maior Y: %.2f", areaY);
		}
		guardaValorObjeto.close();
	}

}
