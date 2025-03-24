/*Lista de Exercícios*/

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        maiorNumero();
        anoNascimento();
        validadeSenha();
        valorTotalMacas();
        medidasTriangulo();
        classificacao();
        mediaAritmetica();
        scanner.close();
    }

    //Escreva um programa para ler 2 valores (considere que não serão informados valores iguais)
    // e escrever o maior deles.
    public static void maiorNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira o segundo número:");
        double num2 = scanner.nextDouble();

        double min = Math.min(num1, num2);
        System.out.println("O menor valor é: " + min);
        scanner.close();
    }

    //Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou
    // não votar este ano (não é necessário considerar o mês em que ela nasceu).
    public static void anoNascimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        if (anoNascimento < 18) {
            System.out.println("Não pode votar.");
        } else {
            System.out.println("Pode votar.");
        }
        scanner.close();
    }

    //Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.
    // Devem ser impressas as seguintes mensagens:
    // ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.
    public static void validadeSenha() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Ofereça uma senha: ");
        int senha = scanner.nextInt();

        if (senha != 1234) {
            System.out.println("ACESSO NEGADO");
        } else {
            System.out.println("ACESSO PERMITIDO");
        }
        scanner.close();
    }

    //As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
    // e R$ 0,25 se forem compradas pelo menos doze. Escreva um
    //programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
    public static void valorTotalMacas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de maçãs adquiridas: ");
        int macasAdquiridas = scanner.nextInt();

        double precoMenosDeUmaDuzia = 0.25;
        double precoAoMenosUmaDuzia = 0.30;
        double valorTotal;

        if (macasAdquiridas <= 0) {
            System.out.println("Insira um valor positivo: ");
        } else {
            if (macasAdquiridas <= 12) {
                valorTotal = macasAdquiridas * precoMenosDeUmaDuzia;
            } else {
                valorTotal = macasAdquiridas * precoAoMenosUmaDuzia;
            }
            System.out.println("O valor das maçãs é: " + valorTotal);
            scanner.close();
        }
    }

    //Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
    // Isósceles ou Escaleno.
    // Sendo que: − Triângulo Equilátero: possui os 3 lados iguais. − Triângulo Isóscele: possui 2 lados iguais.
    // − Triângulo Escaleno: possui 3 lados diferentes.
    public static void medidasTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro lado: ");
        double primeiroLado = scanner.nextDouble();
        System.out.println("Insira o segundo lado: ");
        double segundoLado = scanner.nextDouble();
        System.out.println("Insira o terceiro lado: ");
        double terceiroLado = scanner.nextDouble();

        if (primeiroLado == 0 || segundoLado == 0 || terceiroLado == 0) {
            System.out.println("Você não pode inserir valores negativos!");
        } else {
            if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
                System.out.println("O triângulo é Equilátero!");
            } else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado) {
                System.out.println("O triângulo é Escaleno!");
            } else {
                System.out.println("O triângulo é Isósceles!");
            }
        }
    }

    //Leia o código de um determinado produto e mostre sua classificação. Utilize a seguinte tabela como referência:
    public static void classificacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um código: ");
        int codigo = scanner.nextInt();

        String categoria = switch (codigo) {
            case 1 -> "Alimento não-perecível.";
            case 2 -> "Alimento perecível.";
            case 3 -> "Vestuário.";
            case 4 -> "Higiene Pessoal.";
            case 8, 9, 10, 11, 12, 13, 14, 15 -> "Limpeza e utensílios domésticos.";
            default -> "Código Inválido.";
        };
        System.out.println(categoria);
        scanner.close();
    }

    //Faça um programa que receba duas notas,
    // calcule e mostre a média aritmética e mensagem que está na tabela a seguir:
    public static void mediaAritmetica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Insira um valor entre 0 e 10.");
        }
        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();
        if (nota2 < 0 || nota2 > 10){
            System.out.println("Insira um valor entre 0 e 10.");
        }

        double media = (nota1+nota2)/2;

        if (media <= 4){
            System.out.println("Reprovadi");
        }else if (media <= 7){
            System.out.println("Exame");
        }else{
            System.out.println("Aprovado");
        }
        scanner.close();
    }
}





