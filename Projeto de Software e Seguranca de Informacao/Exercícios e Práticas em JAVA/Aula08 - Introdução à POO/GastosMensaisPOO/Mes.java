package GastosMensaisPOO;

public class Mes {
	public double alimentacao;
	public double luz;
	public double energia;
	
	public double somaTotal() {
		double contaMes = alimentacao + luz + energia;
		return contaMes;
	}
}
