package src.br.com.fiap.umtdspo.exercises;

public class Fornecedor extends Pessoa{
    //Atributos
    private double valorCredito;
    private double valorDivida;

    //Construtores
    public Fornecedor(double valorCredito, double valorDivida) {
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Seletores e Modificadores
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //Métodos
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
}
