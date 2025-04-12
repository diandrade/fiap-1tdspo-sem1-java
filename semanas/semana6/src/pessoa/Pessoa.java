package pessoa;

public class Pessoa {

    public String nome;
    public int anoNascimento;
    public String cpf;

    public int idadeEm2025(){
        return 2025 - anoNascimento;
    }

}
