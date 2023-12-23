package Etapa2;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataDeValidade){

        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataDeValidade;
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

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data){
        if (data.getDia() >= dataValidade.getDia() && data.getMes() >= dataValidade.getMes() && data.getAno() >= dataValidade.getAno()){
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return  "Produto: " + this.nome + "\n" +
                "Preco R$: " + this.preco + "\n" +
                "Data de validade: " + this.dataValidade;
    }
}
