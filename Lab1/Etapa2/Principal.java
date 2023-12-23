package Etapa2;

public class Principal {

    public static void main(String[] args) {


        int leitorTeclado;
        Loja loja = null;
        Endereco endereco = null;
        Produto produto = null;
        Data dataValidade = null;

        do {
            System.out.println("[1] criar uma loja");
            System.out.println("[2] criar um produto");
            System.out.println("[3] sair");
            System.out.println();
            leitorTeclado = Teclado.leInt();
            if (leitorTeclado <= 0 || leitorTeclado > 3) {
                System.out.println("Opção invalida.");
                System.out.println();
            }

            if (leitorTeclado == 1) {
                String nomeLoja = Teclado.leString("Didite o nome da loja: ");
                int qtdFuncionarios = Teclado.leInt("Digite quantos funcionários a lota tem: ");
                String nomeDaRua = Teclado.leString("Digite o nome da rua da loja: ");
                String cidade = Teclado.leString("Digite o nome da cidade da loja: ");
                String estado = Teclado.leString("Digite o Estado da loja: ");
                String pais = Teclado.leString("Digite o país da loja: ");
                String cep = Teclado.leString("Digite o CEP da loja: ");
                String numero = Teclado.leString("Digite o número da loja: ");
                String complemento = Teclado.leString("Digite um complemento para a loja: ");
                Data dataFundacao = new Data(Teclado.leInt("Digite o dia da fundação:"), Teclado.leInt("Digite o mês da fundação:"), Teclado.leInt("Digite o ano da fundação:"));
                endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                loja = new Loja(nomeLoja, qtdFuncionarios, endereco, dataFundacao);
            } else if (leitorTeclado == 2) {
                String nomeProduto = Teclado.leString("Digite o nome do produto: ");
                double preco = Teclado.leDouble("Digite o preço do produto: ");
                dataValidade = new Data(Teclado.leInt("Digite o dia do vencimento:"), Teclado.leInt("Digite o mês de vincimento do produto:"), Teclado.leInt("Digite o ano de vencimento do produto:"));
                produto = new Produto(nomeProduto, preco, dataValidade);
            } else if (leitorTeclado == 3) {
                System.out.println("Fechando o programa, \n" +
                                    "E exibindo informações: ");
            }
        } while (leitorTeclado != 3);

        System.out.println(loja);
        System.out.println(endereco);
        System.out.println(produto);
        if (produto.estaVencido(dataValidade)){
            System.out.println("PRODUTO VENCIDO");
       }else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }
}
