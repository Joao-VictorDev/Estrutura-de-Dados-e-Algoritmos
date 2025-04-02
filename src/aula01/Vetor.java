package aula01;

public class Vetor {
    //Estrutura de Dados e Algoritmos com Java : Vetores e Arrays
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void addElemento(String elemento) throws Exception{
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Vetor Cheio");
        }
    }

}
