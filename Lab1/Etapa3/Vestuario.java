package Etapa3;

public class Vestuario extends Loja{

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtoImportado) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtoImportado;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtoImportado) {
        this.produtosImportados = produtoImportado;
    }

    @Override
    public String toString() {

        String temImportado;
        if (produtosImportados == true){
            temImportado = "A loja tem produtos importados.";
        }else {
            temImportado = "A loja não tem produtos importados";
        }

        return "Nome da loja: " + getNome() +  "\n" +
                "Tem " + getQuantidadeFuncionarios() + " funcionários." + "\n" +
                "Tem o endereço: " + getEndereco().toString() + "\n" +
                "Data de fundação da loja: " + getDataFundacao().toString() + "\n" +
                temImportado;
    }
}
