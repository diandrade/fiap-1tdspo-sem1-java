import java.util.Scanner;

// Construir uma calculadora que faça operações de soma
public class CalculadoraSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Imprimir uma mensagem solicitando o primeiro número
        System.out.println("Insira o primeiro número: ");
        //Receber o primeiro número
        float num1 = scanner.nextFloat();

        //Imprimir uma mensagem solicitando o segundo número
        System.out.println("Insera o segundo número: ");
        //Segundo número
        float num2 = scanner.nextFloat();

        //Mostrar o resultado
        float resultado = num1 + num2;

        System.out.println("O resultado da soma " + num1 + " + " + num2 + " é igual a " + resultado);

        scanner.close();
    }
}
