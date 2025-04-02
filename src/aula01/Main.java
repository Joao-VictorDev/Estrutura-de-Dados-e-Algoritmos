package aula01;

public class Main {
    public static void main(String[] args) throws Exception {
        //Estrutura de Dados e Algoritmos com Java : Vetores e Arrays

        Vetor vetor = new Vetor(5);

       try{
           vetor.addElemento("Cachorro");
           vetor.addElemento("Gato");
           vetor.addElemento("Leão");
           vetor.addElemento("Elefante");
           vetor.addElemento("Rato"); // Exceção a ser lançada
           vetor.addElemento("Cobra"); // Exceção a ser lançada
       }catch (Exception e){
           System.out.println("Exceção: " + e.getMessage());
       }
    }
}
