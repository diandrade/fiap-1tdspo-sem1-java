import java.util.Scanner;

public class CalculadoraIdadeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        final int anoDeNascimento = scanner.nextInt();

        CalculadoraIdade2025 calculadoraIdade2025 = new CalculadoraIdade2025();

        scanner.close();
    }


}
