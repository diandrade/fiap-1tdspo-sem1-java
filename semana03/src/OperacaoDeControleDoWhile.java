
//Imprimir todas as idades que são menores que 18
public class OperacaoDeControleDoWhile {
    public static void main(String[] args) {

        // Condição de início
        int idade = 17;


        //Condição de Parada quando idade == 0
        do {
            System.out.println("Idade = " + idade);
            idade--;
        } while (idade >= 0);

    }
}
