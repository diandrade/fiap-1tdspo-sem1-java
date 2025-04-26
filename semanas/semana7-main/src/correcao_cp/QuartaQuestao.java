package correcao_cp;

import java.util.Scanner;

public class QuartaQuestao {

    private static int soma = 0;
    private static int maior;
    private static int menor;
    private static int quantidade = 0;

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros (digite 0 para terminar):");
        System.out.println("Digite um número:");

        int numero = sc.nextInt();
        maior = numero;
        menor = numero;

        while (numero != 0) {
            contabilizarNumero(numero);
            System.out.println("Digite um número:");
            numero = sc.nextInt();
        }

        imprimirResultado(calcularMedia());
    }

    private static double calcularMedia() {
        return (double) soma / quantidade;
    }

    private static void imprimirResultado(double media) {
        if (quantidade > 0) {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Soma dos números: " + soma);
            System.out.printf("Média dos números: %.2f", media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }

    private static void contabilizarNumero(int numero) {
        soma += numero;
        if (numero > maior) {
            maior = numero;
        }

        if (numero < menor) {
            menor = numero;
        }

        quantidade++;
    }


}
