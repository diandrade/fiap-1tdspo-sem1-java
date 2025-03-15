public class OperadoresRelacionais {
    public static void main(String[] args) {

        int valor1 = 60;
        int valor2 = 30;

        //Operadores relacionais
        //Igualdade ==

        boolean saoIguais = valor1 == valor2;
        System.out.println(valor1 + " é igual o " + valor2 + "? " + saoIguais);

        //Desigualdade !=
        boolean saoDesiguais = valor1 != valor2;
        System.out.println(valor1 + " é diferente do " + valor2 + "? " + saoDesiguais);

        //Menor que <
        boolean menorQue = valor1 < valor2;
        System.out.println(valor1 + " é menor que " + valor2 + "? " + menorQue);

        //Menor ou igual que <=
        boolean menorOuIgualQue = valor1 <= valor2;
        System.out.println(valor1 + " é menor ou igual que " + valor2 + "? " + menorOuIgualQue);

        // Maior que >
        boolean maiorQue = valor1 > valor2;
        System.out.println(valor1 + " é maior que " + valor2 + "? " + maiorQue);

        // Maior ou igual que >=
        boolean maiorOuIgualQue = valor1 >= valor2;
        System.out.println(valor1 + " é maior ou igual que " + valor2 + "? " + maiorOuIgualQue);
    }
}
