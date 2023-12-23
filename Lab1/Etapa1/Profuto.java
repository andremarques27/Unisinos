package Etapa1;

public class Profuto {

    private String nome;
    private double preco;

    public Profuto(String nome, double preco){

        this.setNome(nome);
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + "\n" +
                "Preco R$: " + this.preco;
    }
}