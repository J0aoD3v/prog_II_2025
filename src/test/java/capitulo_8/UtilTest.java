package capitulo_8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuário
 */
public class UtilTest {
    
    public UtilTest() {
    }

    @Test
    public void testComparacao() {
        IComparavel vetor[] = new Papagaio[3];
        vetor[0] = new Papagaio(3, "Totó");
        vetor[1] = new Papagaio(5, "Gigi");
        vetor[2] = new Papagaio(9, "Filó");
        
        System.out.println(Util.buscar(vetor, new Papagaio(5, "")));
        
        //assertTrue(Util.buscar(vetor, new Papagaio(10, "")));
    }
    
}
