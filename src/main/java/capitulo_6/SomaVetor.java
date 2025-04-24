
package capitulo_6;


public class SomaVetor {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 2, 3, 3, 6, 7, 8, 9, 0};
        int soma = 0; 
        for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        
        
        // outra forma de percorrer vetor
        soma = 0; 
        for ( int aux : vetor){
            soma += aux; 
        } 
        
        
        System.out.println(soma);
    }
}
