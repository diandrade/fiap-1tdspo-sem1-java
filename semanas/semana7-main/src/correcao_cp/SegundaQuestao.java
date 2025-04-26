package correcao_cp;

import java.util.Scanner;

public class SegundaQuestao {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");

        final int num = sc.nextInt();

        if (num < 0) {
            System.out.println("O número inserido é negativo. Insira um número positivo.");
        } else {
            final long resultado = calcularFatorial(num);
            System.out.println(num + "! = " + resultado);
        }

        sc.close();
    }

    private static long calcularFatorial(int num) {
        long fatorial = 1;
        if (num != 0) {
            int i = 1;
            while (i <= num) {
                fatorial *= i;
                i++;
            }
        }
        return fatorial;
    }
}
