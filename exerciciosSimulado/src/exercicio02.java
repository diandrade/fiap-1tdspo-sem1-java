/*Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
Considere que o usuário não informará valores iguais.*/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Insira o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();

        System.out.println("Insira o terceiro valor inteiro: ");
        int terceiroValor = scanner.nextInt();

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor){
            System.out.println(primeiroValor + "," + segundoValor + "," + terceiroValor);
        } else if (segundoValor > terceiroValor) {
            System.out.println("Treinar em casa.");
        }
        scanner.close();
    }
}
