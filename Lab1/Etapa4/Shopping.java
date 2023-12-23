package Etapa4;

import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString(){
        return "Nome do shopping: " + this.nome + "\n" +
                "Endereço: " + endereco.toString() + "\n" +
                "Lojas do shopping: " + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length;i++){
            if (lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                break;
            }
            if (lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    private int cosmeticos = 0, vestuario = 0, bijuteria = 0, alimentacao = 0, informatica = 0;
    public int somaLojas(){
        return cosmeticos + vestuario + bijuteria + alimentacao + informatica;
    }
    public int quantidadeLojasPorTipo(String tipoLoja){
            if (tipoLoja.equals("Cosméticos")){
                cosmeticos++;
                return somaLojas();
            } else if (tipoLoja.equals("Vestuário")){
                vestuario++;
                return somaLojas();
            } else if (tipoLoja.equals("Bijuteria")){
                bijuteria++;
                return somaLojas();
            } else if (tipoLoja.equals("Alimentação")){
                alimentacao++;
                return somaLojas();
            } else if (tipoLoja.equals("Informática")){
                informatica++;
                return somaLojas();
            }
            return -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        double pagaMais = 0;
        Informatica informatica = null;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                if (((Informatica)lojas[i]).getSeguroEletronicos() > pagaMais) {
                    pagaMais = ((Informatica)lojas[i]).getSeguroEletronicos();
                    informatica = ((Informatica)lojas[i]);
                }
            }
        }
        return informatica;
    }
}