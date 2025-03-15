public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //Operadores de Atribuição

        //Atribuição Simples =
        int valor1 = 10;
        int valor2 = 20;

        System.out.println("valor1 = "+ valor1);
        System.out.println("valor2 = "+ valor2);

        //Somar e atribuir +=
        valor1 += valor1 + valor2;

        System.out.println("valor1 = "+ valor1);
        System.out.println("valor1 = "+ valor2);

        //Subtração e atribuição -=
        valor1 -= valor2;
        System.out.println("valor1 = " + valor1);
        System.out.println("valor2 = " + valor2);

        //Divisão e Atribuição /=

        valor1 /= valor2;
        System.out.println("valor1 = "+ valor1);
        System.out.println("valor2 = "+ valor2);

        //Módulo e Atributo

        valor1 %= valor2;
        System.out.println("valor1 = "+ valor1);
        System.out.println("valor2 = "+ valor2);
    }
}
