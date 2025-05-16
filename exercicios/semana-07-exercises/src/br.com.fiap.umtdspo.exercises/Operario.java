package src.br.com.fiap.umtdspo.exercises;

public class Operario extends Empregado{
    //Atributos
    private double valorProducao;
    private double comissao;

    //Construtores
    public Operario(int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    //Métodos
    public double calcularSalario(){
        double conversaoDecimal = comissao / 100;
        return super.calcularSalario() + conversaoDecimal * valorProducao;
    }
}
