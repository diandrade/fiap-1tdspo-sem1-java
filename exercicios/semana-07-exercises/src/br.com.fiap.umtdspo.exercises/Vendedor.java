package src.br.com.fiap.umtdspo.exercises;

public class Vendedor extends Empregado {
    //Atributos
    private double valorVendas;
    private double comissao;

    //Construtores
    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    //Getters e Setters
    public double getValorVendas() { return valorVendas; }
    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas; }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }

    //Métodos
    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario();
        double valorComissao = valorVendas * (comissao / 100);
        return salarioEmpregado + valorComissao;
    }
}
