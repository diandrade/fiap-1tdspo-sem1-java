import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros (digite 0 para terminar): ");

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            int maior = n;
            int menor = n;
            int soma = 0;
            int qtdN = 0;

            while (n != 0) {
                soma += n;
                qtdN += 1;
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
                System.out.println("Digite um número: ");
                n = sc.nextInt();
            }

            double media = (double) soma / qtdN;

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        }
        sc.close();
    }
}