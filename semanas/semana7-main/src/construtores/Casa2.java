package construtores;

import java.util.Objects;

public class Casa2 {
    // Atributos
    private String nomePedreiro;

    private int qntSacoCimento;

    private int qntBloco;

    //Construtores
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

    //Métodos
    public String getNomePedreiro() {
        return nomePedreiro;
    }

    public void setNomePedreiro(String nomePedreiro) {
        this.nomePedreiro = nomePedreiro;
    }

    public int getQntSacoCimento() {
        return qntSacoCimento;
    }

    public void setQntSacoCimento(int qntSacoCimento) {
        this.qntSacoCimento = qntSacoCimento;
    }

    public int getQntBloco() {
        return qntBloco;
    }

    public void setQntBloco(int qntBloco) {
        this.qntBloco = qntBloco;
    }

    public boolean verificaSeSaoIguais(Casa2 casaParaComparar){
        return (this.nomePedreiro == casaParaComparar.nomePedreiro) && (this.qntBloco == casaParaComparar.qntBloco)
                && (this.qntSacoCimento == casaParaComparar.qntSacoCimento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa2 casa2 = (Casa2) o;
        return qntSacoCimento == casa2.qntSacoCimento && qntBloco == casa2.qntBloco && Objects.equals(nomePedreiro, casa2.nomePedreiro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePedreiro, qntSacoCimento, qntBloco);
    }
}
