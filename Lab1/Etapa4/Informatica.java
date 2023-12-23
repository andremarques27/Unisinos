package Etapa4;

public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos,double seguroEletronicos) {
        super(nome,quantidadeFuncionarios,salarioBaseFuncionario,endereco,dataFundacao,maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Nome da loja: " + getNome() +  "\n" +
                "Tem " + getQuantidadeFuncionarios() + " funcionários." + "\n" +
                "Tem o endereço: " + getEndereco().toString() + "\n" +
                "Data de fundação da loja: " + getDataFundacao().toString() + "\n" +
                "Valor pago ao seguro: " + getSeguroEletronicos();
    }
}
