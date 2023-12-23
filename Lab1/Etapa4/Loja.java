package Etapa4;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos){

        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDaFundacao, int maxProdutos){

        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataDaFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDaFundacao) {
        this.dataFundacao = dataDaFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Nome da loja: " + this.nome +  "\n" +
                "Tem " + this.quantidadeFuncionarios + " funcionários." + "\n" +
                "Tem o endereço: " + endereco.toString() + "\n" +
                "Data de fundação da loja: " + dataFundacao.toString() + "\n" +
                "A quantidade maxima de produtos que a loja suporta é: " + this.estoqueProdutos;
    }

    public double gastosComSalario() {
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {

        if (quantidadeFuncionarios < 10) {
            return 'P';
        }else if (quantidadeFuncionarios <= 30) {
            return 'M';
        }else {
            return 'G';
        }
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++){
            System.out.println(estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto produto){{
            for (int i = 0; i < estoqueProdutos.length; i++){
                if (estoqueProdutos[i] == null) {
                    estoqueProdutos[i] = produto;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                return false;
            }
            if (estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

}
