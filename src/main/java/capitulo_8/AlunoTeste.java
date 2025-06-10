package capitulo_8;

import java.util.ArrayList;
import java.util.Collections;

public class AlunoTeste {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(new Aluno(1, "Hermione Granger", 4));
        alunos.add(new Aluno(3, "Draco Malfoy", 2));
        alunos.add(new Aluno(8, "Herry Potter", 5));
        alunos.add(new Aluno(5, "Rony Weasley", 5));
        
        Collections.sort(alunos, new ComparadorPorPeriodo());
        
        for(Aluno a : alunos){
            System.out.println(a.getPeriodo() + " " + a.getNome());
        }

    }

}
