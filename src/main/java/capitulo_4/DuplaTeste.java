package capitulo_4;


public class DuplaTeste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(1, "Tico");
        Aluno aluno2 = new Aluno(2, "Teco");
        Dupla d = new Dupla(aluno1, aluno2); 
        
        
        d.mostrarAlunos(); 
        
    }
    
}
