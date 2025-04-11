import java.util.ArrayList;
import java.util.List;

public class FinalSample {
    private static final int idade = 26;
    private static int idadeVerdadeira = 36;
    private static final List<String> listaNomes = new ArrayList<>();

    public final int getIdade(){
        return idade;
    }

    public static void main(String[] args) {
        System.out.println("Minha idade é " + idade);
        System.out.println("Minha idade verdadeira é " + idadeVerdadeira);
        idadeVerdadeira = 43;
        listaNomes.add("Ana");
    }
}
