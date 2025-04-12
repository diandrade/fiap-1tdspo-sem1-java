package pessoa;

import java.util.Scanner;

public class PessoaApp {

    public static void main(String[] args) {
        /*pessoa.Pessoa p1 = new pessoa.Pessoa();
        p1.nome = "Pedro";
        p1.anoNascimento = 1990;
        p1.cpf = "305.297.948-57";

        pessoa.Pessoa p2 = new pessoa.Pessoa();
        p2.nome = "Maria";
        p2.anoNascimento = 1996;

        System.out.println(p1.nome + " tem " + p1.idadeEm2025() + " anos");
        System.out.println(p2.nome + " tem " + p2.idadeEm2025() + " anos");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um CPF válido: ");
        final String cpf = scanner.next();

        if (CpfUtil.isValidCpf(cpf)){
            Pessoa pessoa = new Pessoa();
            System.out.println("Insira nome");
            pessoa.nome = scanner.next();

            System.out.println("Insira o ano de nascimento: ");
            pessoa.anoNascimento = scanner.nextInt();

            pessoa.cpf = cpf;

            System.out.println(pessoa.nome + " tem ");
        } else {
            System.out.println("CPF inválido.");
        }
        scanner.close();
    }
}
