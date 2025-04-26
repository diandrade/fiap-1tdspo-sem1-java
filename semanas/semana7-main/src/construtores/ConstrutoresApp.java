package construtores;

public class ConstrutoresApp {

    public static void main(String[] args) {

        final Casa casa = new Casa();

        final Casa2 casa2 = new Casa2("José", 10, 1000);

        //a ordenaçao é importante no construtor
        //a unica validacao automatica feita pelo JAVA é a tipagem
        final Casa2 casa21 = new Casa2( 10, 1000);


    }
}
