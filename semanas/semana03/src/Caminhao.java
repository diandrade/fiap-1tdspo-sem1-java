//Classe
public class Caminhao {

    //Atributos
    private int velocidade;

    private CorDeCarro cor;

    private Integer ano;

    private String modelo;

    //Métodos
    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidadeAtual(int velocidade){
        this.velocidade = velocidade;
    }

    void acelerar(){
        velocidade++; //Equivalente velocidade = velocidade + 1
    }

    void frear(){
        if (velocidade != 0)
            velocidade--; //Equivalente velocidade = velocidade -1
    }
}
