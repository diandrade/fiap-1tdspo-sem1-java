package equalsEhashcode;

import construtores.Casa2;

public class EqualsApp {
    public static void main(String[] args) {
        Casa2 casaA = new Casa2("João", 10, 100);
        Casa2 casaB = new Casa2("João", 10, 100);

        //Quero saber se casaA é igual a casaB
        System.out.println("Casa A é igual a casa B?" + (casaA == casaB));
        System.out.println("Casa A é igual a casa B?" + (casaA.verificaSeSaoIguais(casaB)));

        String meuNomeA = new String("Tiago");
        String meuNomeB = new String("Tiago");

        System.out.printf("NomeA é igual ao nomeB?" + (meuNomeA == meuNomeB));
    }
}
