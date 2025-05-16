package src;

import src.br.com.fiap.umtdspo.exercises.Administrador;
import src.br.com.fiap.umtdspo.exercises.Empregado;
import src.br.com.fiap.umtdspo.exercises.Fornecedor;
import src.br.com.fiap.umtdspo.exercises.Operario;

public class Main {
    public static void main(String[] args) {
        //Fornecedor fornecedor = new Fornecedor(10.5, 5.5);
        Empregado empregado = new Empregado(10, 1000, 10);
        Administrador administrador = new Administrador(20, 1000, 10, 100);
        Operario operario = new Operario(30, 1000, 10, 1000, 10);

        //System.out.printf("Saldo: %.2f", fornecedor.obterSaldo());
        System.out.printf("Salário final do funcionário: R$%.2f", empregado.calcularSalario());
        System.out.println();
        System.out.printf("Salário final do administrador: R$%.2f", administrador.calcularSalario());
        System.out.println();
        System.out.printf("Salário final do operário: R$%.2f", operario.calcularSalario());
    }
}
