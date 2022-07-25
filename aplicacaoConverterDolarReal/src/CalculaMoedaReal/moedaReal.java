package CalculaMoedaReal;

public class moedaReal {

	public static double IOF = 0.06;

	public static double DolarReal(double dolar) {
		return dolar;
	}

	public static  double ConverterDolar(double valorEntradaDolar, double dolar) {
		return valorEntradaDolar * dolar;
	}

	public static  double CalculaIOFTotal(double dolar, double valorEntrada) {
		return ConverterDolar(valorEntrada, dolar) + (ConverterDolar(valorEntrada, dolar) * IOF);
	}
}
