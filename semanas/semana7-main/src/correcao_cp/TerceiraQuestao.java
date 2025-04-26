package correcao_cp;

import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        final int num = sc.nextInt();

        if(num < 0 ) {
            System.out.println("Valor inserido inválido. Insira um valor inteiro positivo.");
        } else {
            System.out.println("Os números ímpares são:");
            imprimaNumerosImpares(num);
        }

        sc.close();
    }

    private static void imprimaNumerosImpares(int num) {
        for (int i = 1; i <= num; i+=2) {
            System.out.println(i);
        }
    }
}
