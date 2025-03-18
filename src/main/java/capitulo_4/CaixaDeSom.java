package capitulo_4;


public class CaixaDeSom {
    // atributos ou campos 
    boolean ligada;
    int volume; 
    
    
    // construtor - seta valores para os campos 
    CaixaDeSom(){
        ligada = false;
        volume = 0; 
    }
    
    // método - altera o estado do objeto 
    void ligar(){
        ligada = true; 
    }
    
    void desligar(){
        ligada = false; 
    }
    
    void aumentarVolume(){
        volume++;
    }
    
    void diminuirVolume(){
        volume--;
    }
}
