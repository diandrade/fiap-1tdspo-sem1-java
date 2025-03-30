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
            System.out.println("O primeiro valor é maior que os outros dois valores.");
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor){
            System.out.println("O segundo valor é maior que os outros dois valores.");
        }else {
            System.out.println("O terceiro valor é maior que os outros dois valores.");
        }
        scanner.close();
    }
}
