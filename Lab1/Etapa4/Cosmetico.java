package Etapa4;

public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos,double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Nome da loja: " + getNome() +  "\n" +
                "Tem " + getQuantidadeFuncionarios() + " funcionários." + "\n" +
                "Tem o endereço: " + getEndereco().toString() + "\n" +
                "Data de fundação da loja: " + getDataFundacao().toString() + "\n" +
                "Taxa de comercialização: " + getTaxaComercializacao();
    }
}
