package Etapa4;

public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos,double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Nome da loja: " + getNome() +  "\n" +
                "Tem " + getQuantidadeFuncionarios() + " funcionários." + "\n" +
                "Tem o endereço: " + getEndereco().toString() + "\n" +
                "Data de fundação da loja: " + getDataFundacao().toString() + "\n" +
                "Metas de vendas: " + getMetaVendas();
    }
}
