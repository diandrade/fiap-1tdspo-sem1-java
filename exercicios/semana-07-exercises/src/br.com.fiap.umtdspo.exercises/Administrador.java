package src.br.com.fiap.umtdspo.exercises;

public class Administrador extends Empregado{
    //Atributos
    private double ajudaDeCusto;

    //Construtores
    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Seletores e Modificadores
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Métodos
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }
}
