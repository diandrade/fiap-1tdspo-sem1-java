import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu primeiro nome:");
        String primeiroNome = scanner.next();
        System.out.println("Seja bem-vindo " + primeiroNome);

        System.out.println("Insira sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + primeiroNome + " sua idade é " + idade);

        //Na avaliações sempre chamar close() ao finalizar o programa
        scanner.close();
    }
}