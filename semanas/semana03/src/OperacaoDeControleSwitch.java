import java.util.Scanner;

public class OperacaoDeControleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dia de hoje");
        int dia = scanner.nextInt();

        switch(dia) {
            case 5:
                System.out.println("Recebo salário");
                break; //Mandatório para quebrar o fluxo do switch case
            case 10:
                System.out.println("Pagar conta de luz");
                break;
            case 15:
                System.out.println("Pagar internet");
                break;
            default:
                System.out.println("Sem obrigações financeiras");
        }

        scanner.close();
    }
}
