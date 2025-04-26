package construtores;

public class Casa2 {

    private String nomePedreiro;

    private int qntSacoCimento;

    private int qntBloco;

    // só de ter um construtor específico, invalido construtor default criado automaticamente
    public Casa2(String nomePedreiro, int qntSacoCimento, int qntBloco) {
        this.nomePedreiro = nomePedreiro;
        this.qntSacoCimento = qntSacoCimento;
        this.qntBloco = qntBloco;
    }

    Casa2(int qntSacoCimento, int qntBloco) {
        this.qntSacoCimento = qntSacoCimento;
        this.qntBloco = qntBloco;
    }

}
