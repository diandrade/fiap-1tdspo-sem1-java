/*Escreva um método recursivo e estático que calcule e retorne o N-éstimo termo da sequência Fibonacci.*/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual termo você deseja visualizar (N)? ");
        int termo = scanner.nextInt();
        if (termo <= 0) {
            System.out.println("Insira um valor positivo.");
        } else {
            fibonacci(termo);
        }
        scanner.close();
    }

    public static void fibonacci(int n) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int contador = 0;
        int subtracao;

        if (n % 2 == 1) {
            subtracao = 1;
        } else {
            subtracao = 2;
        }

        int limiteContador = n / 2 - subtracao;

        while (contador <= limiteContador) {
            primeiroTermo += segundoTermo;
            segundoTermo += primeiroTermo;
            contador++;
        }

        if (n % 2 == 1) {
            System.out.println("O " + n + "º termo da sequência de fibonacci é: " + primeiroTermo);
        } else {
            System.out.println("O " + n + "º termo da sequência de fibonacci é: " + segundoTermo);
        }
    }
}
