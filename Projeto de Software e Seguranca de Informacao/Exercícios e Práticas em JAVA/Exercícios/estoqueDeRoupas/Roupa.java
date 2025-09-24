package estoqueDeRoupas;

public class Roupa {
	String marca;
	String tipo;
	String tamanho;
	int quantidade;
	double valor;
	
	//Valor total do estoque
	public double  valorEstoque() {
		return quantidade * valor;
	}
	
	//Incrementar quantidade
	public void adicionarEstoque(int qtd) {
		this.quantidade += qtd;
	}
	
	//Decrementar quantidade
	public void removerEstoque(int qtd) {
		if (qtd <= quantidade) {
			this.quantidade -= qtd;
		} else {
			System.out.println("Valor decrementado inválido");
		}
	}

	//Exibindo infos
	public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$" + valor);
        System.out.println("Valor total em estoque: R$" + valorEstoque());
    }
	
}
