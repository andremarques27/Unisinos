package Etapa3;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            if (dia > 29){
                dataPadrao();
            }else {
                dataRecebida(dia, mes, ano);
            }
        }else if (mes == 2) {
            if (dia > 29){
                dataPadrao();
            }else {
                dataRecebida(dia, mes, ano);
            }
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                dataPadrao();
            }else {
                dataRecebida(dia, mes, ano);
            }
        }else if (dia > 31) {
            dataPadrao();
        }else {
            dataRecebida(dia, mes, ano);
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void dataPadrao() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
        System.out.println("Data invalida.");
    }

    public void dataRecebida(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }else{
            return false;
        }
    }
}
