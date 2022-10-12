package Prova;

public class Questao01 {
    public static void main(String[] args) {
        //int[] vetor = new int[10];
        
        int vetor[] = {3,8,7,9,10,11,80,2,1,50};
                     

        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){ 
                if (vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        
        System.out.println("\n\nVetor Decrescente");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
    }
}
