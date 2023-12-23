package Etapa1;

public class Endereco {

    private String nomeDaRua;
    private String cidadde;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidadde, String estado, String pais, String cep, String numero, String complemento) {

        this.nomeDaRua = nomeDaRua;
        this.cidadde = cidadde;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidadde() {
        return cidadde;
    }

    public void setCidadde(String cidadde) {
        this.cidadde = cidadde;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "A loja fica na rua: " + this.nomeDaRua + "\n" +
                "Na cidade: " + this.cidadde + "\n" +
                "No Estado: " + this.estado + "\n" +
                "No país: " + this.pais + "\n" +
                "CEP: " + this.cep + "\n" +
                "Número: " + this.numero + "\n" +
                "Complemento: " + this.complemento;
    }
}