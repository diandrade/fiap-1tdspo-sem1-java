package src.br.com.fiap.umtdspo.exercises;

public class Empregado {
    //Atributos
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //Construtores
    public Empregado(int codigoSetor, double salarioBase, double imposto){
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    //Seletores e Modificadores
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //Métodos
    public double calcularSalario(){
        return salarioBase * (1 - (imposto / 100));
    }
}
