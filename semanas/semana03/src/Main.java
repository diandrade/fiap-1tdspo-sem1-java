import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caminhao meu = new Caminhao();

        Scanner sc = new Scanner(System.in);
        //Receber a velocidade atual
        System.out.println("Qual a velocidade atual: ");
        meu.velocidade = sc.nextInt();
        
        //Velocidade final desejada
        System.out.println("Qual a velocidade final desejada?");
        int velocidadeFinalEsperada = sc.nextInt();
        
        do {
            if (meu.getVelocidade() < velocidadeFinalEsperada){
                meu.acelerar();
            }else {
                meu.frear();
            }
        } while (meu.getVelocidade() != velocidadeFinalEsperada);
        
        //Final imprimir resultado
        System.out.println("A velocidade atual " + meu.getVelocidade() +
                " atingiu a velocidade esperada de " + velocidadeFinalEsperada);
        sc.close();
    }
}