package capitulo_4;

/**
 *
 * @author José
 */
class LinhaTeste {
    
    public static void main(String[] args) {
        Linha linha1 = new Linha();
        linha1.comprimento = 100;
        linha1.desenhar();
        
        Linha linha2 = new Linha(200);
        linha2.desenhar();
    }
    
}
