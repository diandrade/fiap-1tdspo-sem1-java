import java.util.Scanner;

/*Crie um programa em Java que dado um número n, inteiro e positivo,
seja capaz de imprimir todos os números ímpares de 0 a n.
Caso o valor fornecido seja negativo, o programa deve imprimir
apenas a mensagem "Número inválido."*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Número inválido.");
        } else {
            int i = 0;
            while (i <= n) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        scanner.close();
    }
}
