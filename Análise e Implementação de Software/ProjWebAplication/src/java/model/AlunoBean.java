package model;

public class AlunoBean {
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String objetivo;
    private int frequencia;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    
}
