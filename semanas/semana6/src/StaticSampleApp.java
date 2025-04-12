public class StaticSampleApp {

    public static void main(String[] args) {

        //Exemplo 1
        System.out.println("Valor atual da contagem: "+ StaticSample.contagemTotal);
        StaticSample.addOne();
        System.out.println("Valor da contagem: "+ StaticSample.contagemTotal);

    }

}
