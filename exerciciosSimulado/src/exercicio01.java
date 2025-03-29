/*Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
Retângulo ou Obtusângulo. Sendo que: − Triângulo Retângulo: possui um ângulo reto. (igual a 90º) −
Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º) − Triângulo Acutângulo: possui três ângulos agudos.
(menor que 90º)
Observação: Os somatório dos ângulos internos de um triângulo é sempre 180º*/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro ângulo: ");
        double angulo1 = scanner.nextDouble();
        if (angulo1 <= 0) {
            System.out.println("Insira um valor positivo");
        } else {
            System.out.println("Insira o valor do segundo ângulo: ");
            double angulo2 = scanner.nextDouble();
            if (angulo2 <= 0) {
                System.out.println("Insira um valor positivo");
            } else {
                System.out.println("Insira o valor do terceiro ângulo: ");
                double angulo3 = scanner.nextDouble();
                if (angulo3 <= 0) {
                    System.out.println("Insira um valor positivo");
                } else {
                    double soma = angulo1 + angulo2 + angulo3;
                    if (soma != 180) {
                        System.out.println("A soma dos ângulos precisa ser igual a 180!");
                    } else {
                        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                            System.out.println("O triângulo é retângulo");
                        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                            System.out.println("O triângulo é obtusângulo");
                        } else {
                            System.out.println("O triângulo é acutângulo");
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
