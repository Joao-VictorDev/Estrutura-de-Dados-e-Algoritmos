package aula01;

public class Vetor {
    //Estrutura de Dados e Algoritmos com Java : Vetores e Arrays
    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void addElemento(String elemento){
        for (int i = 0; i < this.elementos.length;i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}
