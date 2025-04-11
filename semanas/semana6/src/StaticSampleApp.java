public class StaticSampleApp {
    public static void main(String[] args) {

        StaticSample sampleContagem = new StaticSample();

        System.out.println("Valor atual da contagem: +" + sampleContagem.contagemTotal);
        sampleContagem.addOne();
        System.out.println("Valor atual da contagem: +" + sampleContagem.contagemTotal);

        CalculadoraIdade2025 calculadora = new CalculadoraIdade2025();
        System.out.println("Idade = " + calculadora.getIdade(1989));
    }
}
