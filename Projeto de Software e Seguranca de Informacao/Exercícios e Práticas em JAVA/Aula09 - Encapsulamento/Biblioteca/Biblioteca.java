package Biblioteca;

public class Biblioteca {
	private String livro;
	private String autor;
	private int quantidade;
	private double valor;
	
	//Getters/Setters
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
