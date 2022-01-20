package Retangulo;

import java.util.Scanner;

import uteis.Calculo;


public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		Calculo calculo = new Calculo();
		System.out.println("Entre com o valor menor de retangulo:");
		calculo.baseMenor =sc.nextDouble();
		System.out.println("ente com o valor maior do  retangulo:");
		calculo.baseMaior= sc.nextDouble();
		
		System.out.printf("\n     AREA = %.2f", calculo.calculaArea());
		System.out.printf("\nPERIMETRO = %.2f", calculo.calculaPerimetro());
		System.out.printf("\n DIAGONAL = %.2f", calculo.calculaDiagonal());
		
		sc.close();

	}

}
