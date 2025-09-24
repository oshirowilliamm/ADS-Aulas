package DesafioMediaPOO;

public class Notas {
	public double n1;
	public double n2;
	public double n3;
	
	public double Media() {
		double media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	public String Situacao(double media) {
		String situacao;
		if (media >= 7) {
			return situacao = "Aprovado";
		} else {
			return situacao = "Reprovado";
		}
	}
}