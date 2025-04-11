public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Operadores aritméticos em Java
        //Soma, Subtração, Multiplicação, Divisão e Módulo

        int anoDeNascimento = 2002;
        int anoAtual = 2025;

        //Subtraçao (-)
        int idade = anoAtual - anoDeNascimento;

        System.out.println("Eu tenho " + idade + " anos.");

        //Adição (+)
        int anosParaAdicionar = 10;
        int idadeFutura = idade + anosParaAdicionar;

        System.out.println("Daqui a " + anosParaAdicionar + " terei " + idadeFutura + " anos.");

        //Multiplicação (*)

        //Valor total para comprar 30 balas a R$1,00
        byte valor = 1;
        byte quantidadeDeAlunos = 30;

        double valorTotal = (double) (valor * quantidadeDeAlunos); //Casting

        //Desconto
        double desconto = 1.5;
        valorTotal = valorTotal - desconto;

        System.out.println("Valor total =  R$" + valorTotal);

        //Pagar o valor total em 10 parcelas
        double parcela = valorTotal / 10;

        System.out.println("Valor da parcela = R$" + parcela);

        // Módulo (%)
        // Determine o resto da divisão de 7 por 2

        System.out.println("Resto da divisão de 5 por 2 é: " + 5%2);
        System.out.println("Resto da divisão de 6 por 2 é: " + 6%2);
        System.out.println("Resto da divisão de 7 por 2 é: " + 7%2);
        System.out.println("Resto da divisão de 8 por 2 é: " + 8%2);
        System.out.println("Resto da divisão de 9 por 2 é: " + 9%2);
    }
}
