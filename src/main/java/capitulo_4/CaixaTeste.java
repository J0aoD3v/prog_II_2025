package capitulo_4;

/**
 * @author José
 */
public class CaixaTeste {

    public static void main(String[] args) {
        Caixa caixa = new Caixa(); // chamou o primeiro construtor
        
        Caixa caixa2 = new Caixa(3, 5, 7);  // chamou o segundo construtor
        int volume = caixa2.calcularVolume();  // chamou o método
        System.out.println(volume);
    }
}
