import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        if (peso <= 0) {
            System.out.println("Insira um peso maior que 0.");
        } else {
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Insira uma altura maior que 0;");
            } else {
                double imc = peso / (altura * altura);
                if (imc < 16) {
                    System.out.printf("(Magreza grave) IMC = %.2f\n", imc);
                } else if (imc < 17) {
                    System.out.printf("(Magreza moderada) IMC = %.2f\n", imc);
                } else if (imc < 18.5) {
                    System.out.printf("(Magreza leve) IMC = %.2f\n", imc);
                } else if (imc < 25) {
                    System.out.printf("(Saudável) IMC = %.2f\n", imc);
                } else if (imc < 30) {
                    System.out.printf("(Sobrepeso) IMC = %.2f\n", imc);
                } else if (imc < 35) {
                    System.out.printf("(Obesidade grau 1) IMC = %.2f\n", imc);
                } else if (imc < 40) {
                    System.out.printf("(Obesidade severa) IMC = %.2f\n", imc);
                } else {
                    System.out.printf("(Obsidade mórbida) IMC = %.2f\n", imc);
                }
            }
            sc.close();
        }
    }
}
