package construtores;

public class Casa {

    private String nomePedreiro;

    private int qntSacoCimento;

    private int qntBloco;

    // atalho ide =>  alt + insert => Constructor
    public Casa(String nomePedreiro, int qntSacoCimento, int qntBloco) {
        this.nomePedreiro = nomePedreiro;
        this.qntSacoCimento = qntSacoCimento;
        this.qntBloco = qntBloco;
    }

    public Casa(){}

}
