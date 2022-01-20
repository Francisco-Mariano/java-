package UteisInformacao;

public class INFORMACAO{

	public String nome;
	public double salario;
	public double taxa = 1000;
		
	public double  salarioLiquido() {
		
		return salario - taxa;
	}
	
//public doubele incremento(salario) {
//		this.salario=salario -taxaporcen;
//	}
	
}
