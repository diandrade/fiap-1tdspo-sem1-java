package correcao_cp;

import java.util.Scanner;

public class PrimeiraQuestao {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em Kg:");
        final double peso = scanner.nextDouble();

        System.out.println("Digite o seu altura em metros :");
        final double altura = scanner.nextDouble();

        //calcular o imc
        final double imc = calcularImc(peso, altura);


        final String classificacao = classificarImc(imc);

        System.out.printf("IMC = %.2f (%s)", imc, classificacao);

        scanner.close();
    }

    private static String classificarImc(double imc) {
        String classificacao;
        if (imc < 16) {
            classificacao = "Magreza grave";
        } else if (imc < 17) {
            classificacao = "Magreza  moderada";
        } else if (imc < 18.5) {
            classificacao = "Magreza leve";
        } else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade grau 1";
        } else if (imc < 40.0) {
            classificacao = "Obesidade severa";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        return classificacao;
    }

    private static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

}
