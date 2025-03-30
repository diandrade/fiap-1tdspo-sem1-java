/*Escreva um programa capaz de determinar a área de qualquer poligono regular.*/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de lados deste polígono: ");
        int qtdLados = scanner.nextInt();
        if (qtdLados <= 2) {
            System.out.println("Insira ao menos 3 lados (quantidade mínima de lados para um polígono).");
        } else {
            System.out.println("Insira o comprimento de um dos lados deste polígono: ");
            double comprimentoLado = scanner.nextDouble();
            if (comprimentoLado <= 0) {
                System.out.println("Não existe comprimento negativo.");
            } else {
                double perimetro = qtdLados * comprimentoLado;
                double tangente = Math.tan(Math.PI / qtdLados);
                double apotema = comprimentoLado / (2 * tangente);
                double areaPoligonoRegular = 0.5 * perimetro * apotema;

                System.out.printf("A área do polígono regular é: %.2f%n", areaPoligonoRegular);
            }
        }
        scanner.close();
    }
}
