
package capitulo_8;

import java.util.Comparator;


public class ComparadorPorPeriodo implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Integer.compare(a1.getPeriodo(), a2.getPeriodo());
    }
    
}
