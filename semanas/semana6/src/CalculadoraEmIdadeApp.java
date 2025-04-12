import java.util.Scanner;

public class CalculadoraEmIdadeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        final int anoNascimento =  scanner.nextInt();

        final int idade = CalculadoraIdadeEm2025.calcule(anoNascimento);

        System.out.println("Idade em anos: " + idade+ " em " + CalculadoraIdadeEm2025.anoAtual );

        scanner.close();
    }
}