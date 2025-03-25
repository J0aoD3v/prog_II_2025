package capitulo_4;

/**
 *
 * @author José
 */
class Linha {
    double comprimento;
    
    Linha() {
        comprimento = 0.0;
    }

    Linha(double c) {
        comprimento = c;
    }
    
    void desenhar(){
        for(int i=0; i < comprimento; i++){
            System.out.print("_");
        }
        System.out.println("\n");
    }
    
}
