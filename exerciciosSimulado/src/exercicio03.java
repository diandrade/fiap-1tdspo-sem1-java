/*Escreva um programa capaz de determinar a área de qualquer poligono regular.*/

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o perímetro deste polígono: ");
        double perimetro = scanner.nextDouble();

        System.out.println("Insira o apótema deste polígono: ");
        double apotema = scanner.nextDouble();

        double area = perimetro * apotema / 2;
        System.out.printf("A área do polígono regular é: %.2f\n", area);

        scanner.close();
    }
}
