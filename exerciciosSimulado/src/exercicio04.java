/*Escreva um método recursivo e estático que calcule e retorne o N-éstimo termo da sequência Fibonacci.*/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        int primeiroTermo = 1;
        int segundoTermo = 1;

        int contador = 0;

        while (contador <= 17) {
            primeiroTermo += segundoTermo;
            System.out.println(primeiroTermo + " (Primeiro Termo)");
            System.out.println(segundoTermo + " (Segundo Termo)");
            contador++;
        }
        System.out.println("O décimo sétimo termo da sequência de fibonacci é: " + primeiroTermo);
    }
}
