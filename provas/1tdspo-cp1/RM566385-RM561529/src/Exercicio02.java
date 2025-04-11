import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Número inválido.");
        } else {
            int fatorial = 1;
            int i = 1;

            while (i <= num) {
                fatorial *= i;
                i++;
            }
            System.out.println("O valor fatorial de " + num + " é: " + fatorial);
        }
        scanner.close();
    }
}
