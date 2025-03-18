package capitulo_4;

/**
 * Crie uma classe chamada Caixa, com os atributos largura, altura e
 * profundidade. Crie um método chamado calcularVolume( ) que retorna o volume
 * da caixa.
 *
 * @author José
 */
class Caixa {
    // campos ou atributos 
    int altura;
    int largura;
    int profundidade;

    // construtor
    Caixa() {
        altura = 0;
        largura = 0;
        profundidade = 0;
    }

    // construtor 
    Caixa(int a, int l, int p) {
        altura = a;
        largura = l;
        profundidade = p;
    }

    
    // método 
    int calcularVolume() {
        int volume = altura * largura * profundidade;
        return volume;
    }

}
