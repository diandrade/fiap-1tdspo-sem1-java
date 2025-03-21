import java.util.Scanner;

public class OperacoesDeControleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        //Exemplo onde eu valide se um indivíduo é maior de idade
        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        //Estruturas Condiconais

        //Para ser maior de idade tem que ter idade >= 18
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        //Se o indivíduo tiver até 10 anos ou menos não paga ingresso, se for menor que 18 e maior que 10 paga meia entrada,
        // maiores de 18 pagam inteira
        if (idade <= 10) {
            System.out.println("Não paga");
        } else if (idade < 18) {
            System.out.println("Paga meia");
        } else {
            System.out.println("Paga inteira");
        }

        if (idade >= 18) {
            System.out.println("Paga inteira");
        } else if (idade > 10) {
            System.out.println("Paga meia");
        } else {
            System.out.println("Não paga");
        }
        // Dia 5 recebo meu salário, dia 10 pago a conta de luz,
        // dia 15 pago a internet, e nos outros dias do mês,
        // eu não tenho obrigação financeira
        scanner.close();
    }
}
